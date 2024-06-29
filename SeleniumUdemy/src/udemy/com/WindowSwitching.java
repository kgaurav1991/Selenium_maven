package udemy.com;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class WindowSwitching {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//div[@class='_4WELSP']")).click();
        Set<String> window1 = driver.getWindowHandles();
        Iterator<String> it = window1.iterator();
        String parentId = it.next();  
        String childId = it.next();
        driver.switchTo().window(childId);
        Thread.sleep(5000);
        
        System.out.println("Windows Switching ");
        driver.close();
        

	}

}
