package pagePackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement products;
	@FindBy(tagName = "a")List<WebElement>links;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")WebElement Addtocart;
	
	public HomePage(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String Textmthd()
	{
		String actualText=products.getText();
		return actualText;
	}
	
	public int Linkmthd()
	{
		int count=links.size();
		return count;
	}
	public void cartmthd()
	{
		Addtocart.click();
	}

}
