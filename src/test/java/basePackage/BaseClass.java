package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagePackage.CartPage;
import pagePackage.CheckoutPage;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.PaymentPage;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage loginobj;
	public HomePage Homeobj;
	public CartPage cart_obj;
	public CheckoutPage checkout_obj;
	public PaymentPage payment_obj;
	
	@BeforeTest
	public void setup()
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver (options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void objectmthd()
	{
		loginobj=new LoginPage(driver);
		Homeobj=new HomePage(driver);
		cart_obj=new CartPage(driver);
		checkout_obj=new CheckoutPage(driver);
		payment_obj=new PaymentPage(driver);
	}

}
