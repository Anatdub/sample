package ru.spec.event;

import static java.lang.System.out;
public class Test {

		public static void main(String[] args) {
		Switch sw = new Switch();
		Lamp lamp = new  Lamp();
		Radio radio = new  Radio();
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);
		// Если еще один класс, но не потребитель электроэнергии
		sw.addElectricityListener( // Полная программа
				new ElectricityConsumer() {// Указываем ()

					@Override
					public void electricityOn() {
						System.out.println("Fire");
					}			
				}
					
			); // Используем анонимный класс, имя которого нигде более не используется

		
		sw.addElectricityListener( () ->System.out.println("Пожар")	); // Используем Лямбда-выражение

		sw.switchOn();
	}
}

