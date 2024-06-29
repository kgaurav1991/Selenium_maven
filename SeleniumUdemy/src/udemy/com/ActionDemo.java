package udemy.com;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	 public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();

	        Actions act = new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).perform();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();
	        System.out.println(driver.getTitle());
	        driver.close();



	    }

}
