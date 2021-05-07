package Runner;







import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;


 

@RunWith(Cucumber.class)

@CucumberOptions(

 features = "C:\\Users\\Apple\\eclipse-workspace\\Newproject\\src\\test\\java\\Feature\\login.feature",
 glue={"StepDefinition"},
		 plugin= {"pretty","html:target/cucumber-reports/output.html","json:target/Json_Output/cucumber.json"},

// "json:target/Json_Output/cucumber.json"},
 //tags = "not Skip",
 monochrome=true

 )

public class runnnner {

}