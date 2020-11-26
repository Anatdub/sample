package annotation;

@Service(name = "VeryLazyService")
public class LazyService {
	@Init
	public void lazyInit() throws Exception {
		System.out.println("LazyService.lazyInit() started");
	}
}