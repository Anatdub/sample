package annotation;

@Service(name = "SuperSimpleService")
public class SimpleService {
	protected int id;
	private String description = "The dscription of SimpleService";

	@Init
	public void initService() {
		System.out.println("SimpleService.initService() started");
	}

	public void doNothing() {
		System.out.println("SimpleService.doNothing() started");
	}

	private String getDescription() {
		return description;
	}

	protected int getId() {
		return id;
	}
}
