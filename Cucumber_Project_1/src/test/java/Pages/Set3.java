package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Driver_Init.driverDemo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Set3 {
	
	ChromeDriver driver;
	
	public Set3() {
		this.driver = driverDemo.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "displayed-text")
	WebElement display;
	
	@FindBy (id = "hide-textbox")
	WebElement hide;
	
	@FindBy (id = "show-textbox")
	WebElement show;
	
	
	

	
	public void displayName() {
	    display.sendKeys("Kavitha");
	}

	
	public void hideShowBtn() {
	    hide.click();
	    show.click();
	}

	
	public void webTable() {
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[2]"));
	    
	}

	
	 

}
