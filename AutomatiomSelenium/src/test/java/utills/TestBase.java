package utills;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;

	
	public WebDriver initializeDriver() throws IOException {
		
		FileInputStream fil = new FileInputStream(System.getProperty("user.dir")+"\\src\\resource\\Globle.properties");
		//FileInputStream fil = new FileInputStream("C:\\Users\\gaura\\eclipse-workspace\\SeleniumMaven\\src\\main\\java\\udemycom\\GlobleDate.properties");
		
		Properties pro = new Properties();
		pro.load(fil);
		String url = pro.getProperty("QAUrl");
		
		if(driver == null) {
			if(pro.getProperty("browser").equalsIgnoreCase("chrome")) {
			//chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\eclipse-workspace\\AutomatiomSeleniumsrc\\resource\\chromedriver.exe");	
		    driver = new ChromeDriver();
	}
			
		}
		else if(pro.getProperty("browser") == "firefox"){
			//fire fox
			
			
		}
		else if(pro.getProperty("browser") == "Edge") {
			// Edge 
			System.setProperty("webdriver.edge.driver", "edge.exe");
			driver = new EdgeDriver();
			
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}

}
