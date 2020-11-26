package com.company.professions;

public class Driver extends Person {


int workExperience; 
public Driver(String fullName, int age) {
	super(fullName, age);
	
}
public int getWorkExperience() {
	return workExperience;
}
public void setWorkExperience(int workExperience) {
	this.workExperience = workExperience;
}
@Override
public String toString() {
    return "driver's name = " + getFullName() + "\n" +
            "driver's experience = " + getWorkExperience() + " years\n";
}

}
