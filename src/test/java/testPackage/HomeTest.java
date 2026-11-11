package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class HomeTest extends BaseClass
{
	@Test(priority=1)
	public void textverification()
	{
		//loginobj.loginmthd("standard_user","secret_sauce");//calls the login method before executing homepage mthd
		Homeobj.Textmthd();
		String productText=Homeobj.Textmthd();
		Assert.assertEquals(productText ,"Products");
	}
	@Test(priority=2)
	public void linkverification()
	{
		int Linkcount=Homeobj.Linkmthd();
		System.out.println("Number of links-----"+Linkcount);
	}
	@Test(priority=3)
	public void cartmthd()
	{
		Homeobj.cartmthd();
	} 
	
}
