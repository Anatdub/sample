
//ѕрограмма Java дл€ иллюстрации
//разницы между Aggregation и Composition. 

// ласс Engine, который будет использован в машине.  
// ласс 'Car' будет иметь поле типа Engine . 
class Engine {
	// запускаетс€ engine.
	public void work() {

		System.out.println("Engine of car has been started ");

	}

} // Engine class

final class Car {

	// ƒл€ движени€ car необходимо иметь gine.
	private final Engine engine; // Composition
	// private Engine engine; // Aggregation

	Car(Engine engine) {
		this.engine = engine;
	}

	// машина начинает движение, запуска€ engine
	public void move() {

		// if(engine != null)
		{
			engine.work();
			System.out.println("Car is moving ");
		}
	}
}

class TestDifference {
	public static void main(String[] args) {

		// делаем двигатель путем создани€
		// экземпл€ра класса Engine.
		Engine engine = new Engine();

		// ƒелаем car с engine,
		// поэтому  передаем экземпл€р engine
		//  как аргумент дл€
		// создани€ экземпл€ра Car.
		Car car = new Car(engine);
		car.move();

	}
}
