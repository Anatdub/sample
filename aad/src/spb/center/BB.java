package spb.center;

import java.lang.reflect.Field;
// https://javarush.ru/groups/posts/591-vot-tak-final
public class BB {
	public static void main(String[] args) throws Exception {
        String value = "Old value";
        System.out.println(value);

        
//Получаем поле value в классе String

        Field field = value.getClass().getDeclaredField("value");
        
//Разрешаем изменять его

        field.setAccessible(true);
        
//Устанавливаем новое значение

        byte[] newByteArrayReference = "JavaRush".getBytes();
        field.set(value, newByteArrayReference);
        System.out.println(value);

        
/* Вывод:
         * Old value
         * JavaRush
         */

    }
}
