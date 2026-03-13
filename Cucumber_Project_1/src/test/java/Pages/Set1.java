package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Driver_Init.driverDemo;

public class Set1 {

	ChromeDriver driver;

	public Set1() {
		this.driver = driverDemo.getDriver();
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy (xpath = "//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")
	WebElement radiobtn;
	
	@FindBy (id = "autocomplete")
	WebElement suggession;
	
	@FindBy (id = "dropdown-class-example")
	WebElement dropDown;
	
	@FindBy (id = "checkBoxOption1")
	WebElement checkBox;
	
	
	
	public void radioButton() {
		radiobtn.click();
	}
	
	public void suggessionExample(String name) {
		suggession.sendKeys(name);
		
	}
	
	public void dropDown() {
		Select s = new Select(dropDown);
		s.selectByValue("option2");
	}
	
	public void checkBoxEx() {
		checkBox.click();
	}
	
	
	
	
	
	
		
}
