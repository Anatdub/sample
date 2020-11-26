package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Test {
	public static void main(String[] args) {
        Driver driver = new Driver("Dubakov Anatoly", 6);
        driver.setWorkExperience(45);

        Engine engine = new Engine("Nissan", "Nissan Tiida C11 HR15DE", 110.0);

        Car car = new Car("Nissan Tiida","Elegance",1193, driver, engine);

        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();

        System.out.println(car);
    }
}


