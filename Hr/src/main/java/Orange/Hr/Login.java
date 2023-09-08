package Orange.Hr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	

	@FindBy(name="username")private WebElement EnterName;
	@FindBy(name="password")private WebElement EnterPassword;
	@FindBy(xpath="//button[@type='submit']")private WebElement ClickSubmit;
	

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void name() {
		
		EnterName.sendKeys("Admin");
	}
	
	public void password() {
		
		EnterPassword.sendKeys("admin123");
	}
	
	public void submit() {
		
		ClickSubmit.click();
	}
}
