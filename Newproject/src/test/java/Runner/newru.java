package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Apple\\eclipse-workspace\\Newproject\\src\\test\\java\\Feature\\login.feature"
 ,plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber.json","junit:target/cucumber.xml"},
 glue={"StepDefinition"}
 )


public class newru {

}
