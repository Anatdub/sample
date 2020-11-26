package com.company.details;

public class Engine {
	    private String manufacturer;
	    private String model;
	    private double power;
		
	    
	    public Engine(String manufacturer, String model, double power) {
			super();
			this.manufacturer = manufacturer;
			this.model = model;
			this.power = power;
		}
		
	    public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public double getPower() {
			return power;
		}
		public void setPower(double power) {
			this.power = power;
		}

		@Override
	    public String toString() {
	        return "engine's model = " + getModel() + "\n" +
	                "engine's power = " + getPower() + "\n";
	    }
}
