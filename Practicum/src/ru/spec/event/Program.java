package ru.spec.event;
import static java.lang.System.out;
public class Program {

	public static void fire(Object sender) {
		out.println("Message fire");
	}
	public static void main(String[] args) {
		Switcher sw = new Switcher();
		Lamp lamp = new  Lamp();
		Radio radio = new Radio();
		// Event subscribe
	//	sw.consumer = lamp;
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);
		String message = "Пожар";
	
				sw.addElectricityListener(
				new ElectricityConsumer() {// Указываем ()

					public void electricityOn(Object sender) {
						System.out.println(message);
					}			
				}
				
		);
		sw.addElectricityListener( (Object sender) ->System.out.println(message)	); // Используем Лямбда-выражение
		
		sw.addElectricityListener(// Не указываем параметра, т.к. известен
			  s -> Program.fire(s) ); // Lambda - выражение

	sw.addElectricityListener(s->Program.fire(s));	
	sw.addElectricityListener(Program::fire);	
		sw.switchOn();
	}

}
