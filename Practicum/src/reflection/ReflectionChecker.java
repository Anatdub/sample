package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import annotation.RabbitAnnotation;

public class ReflectionChecker {
	public void showClassName(Object object) {
		Class clazz = object.getClass();
		System.out.println(clazz.getName());
	}

	public void showFieldName(Object object) {
		Class clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
	}

	public void showMethodName(Object object) {
		Class clazz = object.getClass();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

	
	public void showFieldsAnnotations(Object object) {
		Class clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			Annotation[] annotations = field.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(field.getName() + "  " + annotation.toString());
			}
		}
	}
	public void fillPrivateFields (Object object) throws IllegalArgumentException, IllegalAccessException {
		Class clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			Annotation annotation = field.getAnnotation(RabbitAnnotation.class);
			// ≈сли така€ аннотаци€ отсутсвует, можно перейти к следующему полю
			if(annotation==null)
				continue;
			// ≈сли аннотаци€ в поле присутствует
			field.setAccessible(true);
			field.set(object, "Field");
			field.setAccessible(false);
		}
	}
	public Object createNewObject (Object object) throws InstantiationException, IllegalAccessException {
		Class clazz = object.getClass();
		return clazz.newInstance();
	}
}
