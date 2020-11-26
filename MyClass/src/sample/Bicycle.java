package sample;

import java.util.ArrayList;
import java.util.List;

public class Bicycle implements Vehicle {


	public int wheels() {
		return 2;
	}
	
	public static void main(String ... argc)
	{
	    List<Vehicle> vehicles = new ArrayList<Vehicle>();

	    vehicles.add(new Bicycle());
	    vehicles.add(new Car());
	    vehicles.add(new Track());

	    for (Vehicle v : vehicles)
	    {
	       System.out.println(v.toString()+"  "+
	           v.wheels());
	    }
	}
}
