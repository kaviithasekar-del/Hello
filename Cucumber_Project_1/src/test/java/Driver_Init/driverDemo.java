package Driver_Init;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverDemo {

	public static ChromeDriver driver;

	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static ChromeDriver getDriver() {
		return driver;
	}
	
	public static void screenshots() throws IOException {
		TakesScreenshot i = ((TakesScreenshot)driver);
		File firstsrc =i.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\admin\\Desktop\\kavi\\Cucumber_Project_1\\src\\main\\java\\image\\screenshot" + System.currentTimeMillis()+".png");
		FileHandler.copy(firstsrc, path);
//		driverDemo.quit();
		
	}
	public static void quit() {
//		driver.quit();
	
	}

	
	
	}
			
	


