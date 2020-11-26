package annotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationProcessor {
	public static Map<String, Object> serviceMap = new HashMap<>();

 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{ 
	inspectService(SimpleService.class); 
	inspectService(LazyService.class); 
	inspectService(String.class);
	// Continue with creating
	loadService("annotation.SimpleService");
	loadService("annotation.LazyService");
	loadService("java.lang.String");
	System.out.println(serviceMap.size());
 } 
	static void inspectService(Class<?> service){
		

		//		Code
		if (service.isAnnotationPresent(Service.class)){
		 Service ann = service.getAnnotation(Service.class); 
		 System.out.println("Service annotation name = " + ann.name()); 
		 System.out.println("Service annotation lazyLoad = " + ann.lazyLoad());
		 }	
		  else { 
		 System.out.println("No service annotation in class" + Service.class); 
		 }
//		List<String> generic = new ArrayList<>();
	}
	static void loadService(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class<?> clazz = Class.forName(className);
		Object serviceObj = clazz.newInstance();
		// add to map by name from annotation
		if (clazz.isAnnotationPresent(Service.class)) {
		serviceMap.put(className, serviceObj);
		System.out.println("У класса "+serviceObj+" Имется аннотация");
		}
	}

	static void perform() {
		Class[] paramTypes = new Class[] {
				String.class, int.class
				};
	}
}
	

