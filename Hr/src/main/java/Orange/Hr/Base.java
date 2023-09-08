package Orange.Hr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static void initializebrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(options);
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("User has entered the wrong browser name");
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
