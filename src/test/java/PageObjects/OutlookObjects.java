package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutlookObjects {


	public WebDriver driver;
	
	public OutlookObjects(WebDriver objdriver) {
		driver = objdriver;
		PageFactory.initElements(objdriver, this);
	}
	
	// All page objects of Outlook.feature file
	@FindBy(xpath= "//*[@type='email']")
	WebElement inputemail;
	
	@FindBy(id="idSIButton9")
	WebElement nextbutton;
	
	@FindBy(id="i0118")
	WebElement inputpass;
	
	@FindBy(id="idSIButton9")
	WebElement signinbutton;
	
	@FindBy(id="idBtn_Back")
	WebElement staysignin;
	
	@FindBy(xpath="//*[text()='New message']")
	WebElement newmsg;
	
	@FindBy(xpath="//*[@role='presentation']/input")
	WebElement recipemail;
	
	@FindBy(xpath="//span[text()='Cc']")
	WebElement CCclick;
	
	@FindBy(xpath="//*[@aria-label='Cc']")
	WebElement InputCC;
	
	@FindBy(xpath="//input[@aria-label='Add a subject']")
	WebElement AddSub;
	
	@FindBy(xpath="//*[@role='textbox']/div")
	WebElement AddContent;
	
	@FindBy(xpath="//*[@title='Send (Ctrl+Enter)']")
	WebElement sendclick;
	
	
	public void email(String email) {
		inputemail.sendKeys(email);
	}
	
	public void next() {
		nextbutton.click();
	}
	
	public void password(String pass) {
		inputpass.sendKeys(pass);
	}
	
	public void signin() {
		signinbutton.click();
	}
	
	public void staysignin() {
		staysignin.click();
	}
	
	public void NewMsg() {
		newmsg.click();
	}
	
	public void recipient(String email) {
		recipemail.sendKeys(email);
	}
	
	public void CCmail(String email) {
		CCclick.click();
		InputCC.sendKeys(email);	
	}
	
	public void SendSub(String sub) {
		AddSub.sendKeys(sub);	
	}
	
	public void addContent(String text) {
		AddContent.sendKeys(text);	
	}
	
	public void sendButton() {
		sendclick.click();
	}
	
}
