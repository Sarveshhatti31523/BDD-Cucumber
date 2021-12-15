package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	public WebDriver driver;
	public Register rp;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		rp = new Register(driver);

	}

	@When("User opens url  {string}")
	public void user_opens_url_http_practice_automationtesting_in_my_account(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("enters Email as {string} and password as {string}")
	public void enters_email_as_and_password_as(String email, String password) {
		rp.email(email);
		rp.password(password);
	}

	@When("click on register")
	public void click_on_register() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		rp.register();
	}

	@When("enters Username as {string} and password as {string}")
	public void enters_Username_as_and_password_as(String email, String password) {
		rp.username(email);
		rp.Logpassword(password);
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		rp.login();
	}

	@Then("User should be successfully registered")
	public void user_should_be_successfully_registered() {

		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']")).isDisplayed());
	}
}
