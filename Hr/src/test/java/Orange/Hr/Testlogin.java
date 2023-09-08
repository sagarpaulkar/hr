package Orange.Hr;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Testlogin extends Base{

	@BeforeClass
	public void setup() {
		Base.initializebrowser("chrome");
	}
	
	@Test	
	public void testLg() {
		Login lg= new Login(driver);
		lg.name();
		lg.password();
		lg.submit();
		System.out.println("hr project");
	}
}
