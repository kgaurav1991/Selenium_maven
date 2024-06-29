package feauter.com;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\gaura\\eclipse-workspace\\UdemyCucumber\\src\\test\\java", 
glue = "stepDefination",monochrome = true,tags="@SmokeTest or @RegressionTest",plugin= {"pretty","html:target/cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
