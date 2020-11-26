package reflection.rabbit;

import annotation.RabbitAnnotation;

public class Rabbit {
	@Deprecated
	@RabbitAnnotation
	private String rabbitName;
	@RabbitAnnotation
	private String rabbitAge;
	
	public String getRabbitName() {
		return rabbitName;
	}
	public String getRabbitAge() {
		return rabbitAge;
	}

}
