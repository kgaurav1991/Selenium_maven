import org.testng.annotations.Test;

public class day1 {
	@Test
	public void m() {
		System.out.println("Hello");
	}
	@Test(groups={"Smoke"})
	public void m1() {
		System.out.println("Welcome");
	}

}
