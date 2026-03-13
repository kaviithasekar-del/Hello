package hooks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Driver_Init.driverDemo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {
	@Before
	public void setUp() {
		driverDemo.setUp();
		driverDemo.getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@After
	public void SShot() throws IOException{
		driverDemo.screenshots();
//		driverDemo.quit();	
	}
	

}
