package testPackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass;


public class LoginTest extends BaseClass
{
	@Test(priority=1)
	public void titleverification_mthd()
	{
		String actualtitle=loginobj.titlemthd();
		Assert.assertEquals(actualtitle,"Swag Labs");
	}
	
	@Test(priority=2)
	public void Login_validationmthd()
	{
		loginobj.loginmthd("standard_user","secret_sauce");
		
		
	}
	
	@Test(priority=3)
	public void urlvalidation()
	{
		String Homeurl=loginobj.urlmthd();
		System.out.println(Homeurl);
		//Assert.assertEquals(Homeurl, "https://www.saucedemo.com/inventory.html");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}
	

}
