package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreanCardStepDefination {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;

	@Given("user is on GreanCard Landing Page")
	public void user_is_on_GreanCard_Landing_Page() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahualshettyacademy.com/seleniumPractise/#/");
	}

	@When("user Searched with shortname {string} and extracted actual name of product")
	public void user_Searched_with_shortname_and_extracted_actual_name_of_product(String shortName)
			throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		landingPageProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(landingPageProductName);
	}

	@Then("user earched for {string} shortname in offer page")
	public void user_searched_for_same_shortname_in_offer_page(String shortName) throws InterruptedException {
		driver.findElement(By.linkText("Top deals")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> il = s1.iterator();
		String parentWindow = il.next();
		String childWimdow = il.next();

		driver.switchTo().window(childWimdow);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		offerPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(i)")).getText();

	}

	@Then("validate product name in offer page matches with landing page")
	public void validate_product_name_in_offer_page() {
		Assert.assertEquals(offerPageProductName, landingPageProductName);

	}

}
