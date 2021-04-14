package Practise.SeleniumProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LumensPOM;

public class TestCase7 extends Base {
	@BeforeTest
	public void bTest() throws IOException {
		
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Throwable {
		LumensPOM l = new LumensPOM(driver);
		l.getAcctdrp().click();
		l.getLoginbtn().click();
		l.getClosePopup().click();
		l.getEmailtxtbox().sendKeys("kovvuruvarshithareddy@gmail.com");
		l.getPasstxtbox().sendKeys("Varshi@123");
		l.getSignupbtn().click();
		//wait for 10 seconds
		Thread.sleep(10000);
	    l.getGoToHome().click();  
	    l.getLighting().click();
		l.getCeilingLights().click();
		l.getChandeliers().click();
		l.getLargeChandeliers().click();
		l.getFilterReadyToShip().click();
		/*WebDriverWait w = new WebDriverWait(driver,10);
	      // presenceOfElementLocated condition
	     w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"refinement-Style\\\"]/div/ul/li[3]/a")));*/
		Thread.sleep(5000);
		l.getFilterColour().click();
		Thread.sleep(5000);
		l.getSelectItem().click();
		l.getAddTocart().click();
	
		l.getGoTocart().click();
		
	}
	
	@AfterTest
	public void aTest() {
		driver.close();
	}

}
