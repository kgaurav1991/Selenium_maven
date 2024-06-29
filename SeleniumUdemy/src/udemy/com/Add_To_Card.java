package udemy.com;

import java.util.Arrays;
import java.util.List;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_To_Card {
	 public static void main(String[] args)throws InterruptedException{
	        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        int j = 0;
	        String[] itemNeeded = {"Watermelon","Bhindi","Apple"};
	        driver.get("https://www.otipy.com/");
	        driver.manage().window().maximize();

	        Thread.sleep(5000);
	        List<WebElement> products = driver.findElements(By.xpath("//div[@class='style_card_container_31_AM']"));
	        for (int i=0; i <products.size();i++){
	            String[] name = products.get(i).getText().split("_");
	            String formatedName = name[0].trim();
	            List itemList = Arrays.asList(itemNeeded);
	            if(itemList.contains(formatedName)){
	                j++;
	                driver.findElement(By.xpath("//span[text()='Add']")).click();
	                System.out.println("Add To Card");
	                if(j == itemNeeded.length){
	                    break;
	                }
	            }
	        }
	    }

}
