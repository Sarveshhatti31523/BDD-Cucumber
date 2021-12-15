package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	public WebDriver driver;
	
	public Register(WebDriver redriver) {
		driver = redriver;
		PageFactory.initElements(redriver, this);
	}
	
	// All page objects of registration.feature file
	@FindBy(id="reg_email")
	WebElement emailbox;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="reg_password")
	WebElement passbox;
	
	@FindBy(id="password")
	WebElement Loginpassword;
	
	@FindBy(xpath= "//input[@name='register']")
	WebElement registerbutton;
	
	@FindBy(xpath= "//input[@name='login']")
	WebElement loginbutton;
	
	public void email(String email) {
		emailbox.sendKeys(email);
	}
	
	public void password(String password) {
		passbox.sendKeys(password);
	}
	
	public void register() throws InterruptedException {
		registerbutton.click();
	}
	
	public void username(String email) {
		username.sendKeys(email);
	}
	
	public void Logpassword(String password) {
		Loginpassword.sendKeys(password);
	}
	
	public void login() throws InterruptedException {
		loginbutton.click();
	}
}
