package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NaukriLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		// Launch the application 
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		// Login on Naukri 
		Thread.sleep(2000);
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kgaurav4291@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("09997573409");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println(driver.getTitle());

		// Click on Updated the profile
		driver.findElement(By.xpath("//a[text()='Complete']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//em[@class='icon edit']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Vicky Kumar");
		driver.findElement(By.id("saveBasicDetailsBtn")).click();
		
		
		
	}

}
