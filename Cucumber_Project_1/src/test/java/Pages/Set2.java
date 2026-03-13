package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Driver_Init.driverDemo;

public class Set2 {
	ChromeDriver driver;

	public Set2() {
		this.driver = driverDemo.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "openwindow")
	WebElement windowbtn;
	
	@FindBy (id = "opentab")
	WebElement tab;
	
	@FindBy (name = "enter-name")
	WebElement enterName;
	
	@FindBy (id = "alertbtn")
	WebElement alertButton;
	
	@FindBy (id = "confirmbtn")
	WebElement confirmButton;
	
	
	public void windowHandling() {
		windowbtn.click();
		Set<String> windowHandles = driver.getWindowHandles(); 
		
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.linkText("CONTACT")).click();
		driver.switchTo().window(list.get(0));
	}
	public void tabClick() {
		tab.click();
        Set<String> windowHandles = driver.getWindowHandles(); 
		
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.linkText("COURSES")).click();
		driver.switchTo().window(list.get(0));
		
	}
	public void Alertbtn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		enterName.sendKeys("kavitha");
		alertButton.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void confirmbtn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		enterName.sendKeys("kavi");
		confirmButton.click();
		Alert b = driver.switchTo().alert();
		b.dismiss();
	}
	
}
