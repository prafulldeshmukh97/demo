import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {

	// test case 1

	@Test
	public void b() {
		System.out.println("helllo");
	}

	@Test
	public void a() {

		System.out.println("this is a");
	}

	@BeforeClass
	public static void a1() {

		System.out.println("this is before");

	}

}
