package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;

public class PaymentTest extends BaseClass {
	
	@Test(priority=1)
	public void screenshort_verify()throws Exception
	{
		payment_obj.screenshot_metod();
	}
	
	@Test(priority=2)
	public void finish_verification()
	{
		payment_obj.finish_method();
	}

}
