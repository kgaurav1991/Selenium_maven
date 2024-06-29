package kumardemo.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	
	@Test
	public void initalDemo() {
		
		extent.createTest("inital Demo");
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        System.out.println(driver.getTitle());
	        extent.flush();
		
	}
	@BeforeTest
	public void config() {
		
		// ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); 
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Kumar Gaurav");
	}

}
