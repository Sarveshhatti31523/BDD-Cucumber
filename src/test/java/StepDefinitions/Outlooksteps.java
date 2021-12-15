package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.OutlookObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Outlooksteps {

	public WebDriver driver;
	public OutlookObjects obj;

	@Given("User Launches Chrome Browser atomatic")
	public void user_launches_chrome_browser_atomatic() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new OutlookObjects(driver);
	}

	@When("User opens outlook url  {string}")
	public void user_opens_outlook_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("enters registered Email as {string}")
	public void enters_registered_email_as(String email) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		obj.email(email);
	}

	@When("click on next")
	public void click_on_next() {
		obj.next();
	}

	@When("enters password as {string}")
	public void enters_password_as(String pass) throws InterruptedException {
		Thread.sleep(5000);
		obj.password(pass);
	}

	@When("click on signin")
	public void click_on_signin() {
		obj.signin();
	}

	@When("click on staysignin")
	public void click_on_staysignin() throws InterruptedException {
		try {

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			obj.staysignin();
		} catch (Exception e) {
			System.out.println("Email is not valid");
		}
		;
	}

	@Then("user should be able to see {string} button")
	public void user_should_be_able_to_see_button(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='New message']")).getText(), string);
	}

	@When("click on new message")
	public void click_on_new_message() throws InterruptedException {
		Thread.sleep(5000);
		obj.NewMsg();
	}

	@When("add recipient's mail as {string}")
	public void add_recipient_s_mail_as(String email) throws InterruptedException {
		Thread.sleep(5000);
		obj.recipient(email);
	}

	@When("add cc as {string}")
	public void add_cc_as(String email) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.CCmail(email);
	}

	@When("add subject as {string}")
	public void add_subject_as(String sub) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.SendSub(sub);
	}

	@When("add content as {string}")
	public void add_content_as(String text) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.addContent(text);
	}

	@When("click send")
	public void click_send() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obj.sendButton();
	}

	@Then("Verify the send mail with subject as {string}")
	public void verify_the_send_mail_with_subject_as(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div/div[2]/*[@title='Sent Items']")).click();
		Assert.assertEquals(string,driver.findElement(By.xpath("//*[@role='option'][1]/div/div/div/div[2]/div[2]/div/span")).getText());
	}

	@Then("Verify user warned with message as {string}")
	public void verify_user_warned_with_message_as(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(string, driver.findElement(By.xpath("//span[text()='This message must have at least one recipient.']")).getText());
	}

}
