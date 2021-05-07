package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Newstepdefinition {

	WebDriver dr=null;


	@Given("^login$")
	public void login() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    dr=new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor)dr;
	   // dr.navigate().to("http://demo.guru99.com/test/newtours/"); 
	    dr.get("https://www.lumens.com/");
	    dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  
	    js.executeScript("window.scrollBy(0,600)");
	    dr.manage().window().maximize();
	    dr.navigate().refresh();
	   
		
		
	}

	@Then("^username and password$")
	public void username_and_password() throws Throwable {
	    
	}

	@Then("^check login button$")
	public void check_login_button() throws Throwable {
	    
	}



	

}
