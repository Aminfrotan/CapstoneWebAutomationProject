package SeleniumAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApplication {
	
	WebDriver driver = new ChromeDriver();
	
	
	public String URL;
	public String Email;
	public String Password;
	public String LoggedIn;
	
	By URL1 = By.linkText("https://admin-demo.nopcommerce.com/");

}
