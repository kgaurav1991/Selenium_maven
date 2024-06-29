package testNGRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\gaura\\eclipse-workspace\\CucumberFramework\\src\\test\\java",
glue = "stepDefination",monochrome = true,plugin= {"pretty","html:target/cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
