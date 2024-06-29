package udemy.com;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println(driver.getCurrentUrl());
	}

}
