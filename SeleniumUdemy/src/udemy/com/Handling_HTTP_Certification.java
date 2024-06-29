package udemy.com;

import org.apache.xpath.operations.String;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_HTTP_Certification {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
       Proxy proxy = new Proxy();
       proxy.setHttpProxy("proxy1.wipro.com");
       options.setCapability("proxy", proxy);

	}

}
