package com.verification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.init.AbstractPage;
import com.init.Common;

public class GeneralVerification extends AbstractPage {

	public GeneralVerification(WebDriver driver) {
		super(driver);
	}

	public boolean homepageverification() {

		Common.pause(10);
		WebElement logo = driver.findElement(By.xpath(".//div[contains(text(),'TOOLSQA')]/./..//img[@alt='TOOLSQA']"));

		if (logo.isDisplayed()) {
			
			System.err.println(logo.getText());
			Common.logcase(logo.getText());
			
			return true;
		}
			else 
		{
				System.err.println("Driver did not Initilized and Wrong Application");
			return false;
	}
	}
	
	public boolean Verify_Ecommerce_Title(){
		
		Common.pause(10);
		String actualTitle = driver.getTitle();
		String expectedTitle = "ONLINE STORE | Toolsqa Dummy Test site";
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Title Verified :"+expectedTitle);
		
		return true;
	}
	
	public boolean Cart_Item_Verify() {
		
		Common.pause(10);
		
		 WebElement item_in_Cart = driver.findElement(By.xpath(".//a[contains(.,'Apple iPad 6 32GB (White, 3D)')]"));
		 String Actual_item = item_in_Cart.getText();
		 System.err.println(Actual_item);
		 Common.log(Actual_item);
		
		 Common.pause(10);
		 
		 if(item_in_Cart.isDisplayed()) {
		 
			 System.err.println("Same Item in Cart");
			 Common.log("Same Item in Cart");
		return true;
	}	
		 else 
	{
			 System.err.println("Different Item in Cart");
			 Common.log("Different Item in Cart");
				return false;
	}
	}
	
	
	public boolean Quantity_Price_Verification() {
		
		WebElement quantity_1 = driver.findElement(By.xpath(".//input[@type='text' and @name='quantity']"));
		quantity_1.clear();
		quantity_1.sendKeys("1");
		System.err.println("When Quantity is 1");
		Common.log("When Quantity is 1");
		
		WebElement update_quantity1 = driver.findElement(By.xpath(".//input[@type='submit' and @value='Update']"));
		update_quantity1.click();
		System.err.println("Click on Update Quantity");
		Common.log("Click on Update Quantity");
		
		WebElement Product_Price1 = driver.findElement(By.xpath(".//span[contains(.,'')]/../..//td[5]//span//span"));
		String product_Price1 = Product_Price1.getText();
		System.err.println("Price Of 1 Product :"+product_Price1);
		Common.log("Click on Update Quantity :"+product_Price1);
		
		WebElement quantity_2 = driver.findElement(By.xpath(".//input[@type='text' and @name='quantity']"));
		quantity_2.clear();
		quantity_2.sendKeys("2");
		System.err.println("When Quantity is 2");
		Common.log("When Quantity is 2");
		
		WebElement update_quantity2 = driver.findElement(By.xpath(".//input[@type='submit' and @value='Update']"));
		update_quantity2.click();
		System.err.println("Click on Update Quantity");
		Common.log("Click on Update Quantity");
		
		WebElement Product_Price2 = driver.findElement(By.xpath(".//span[contains(.,'')]/../..//td[5]//span//span"));
		String product_Price2 = Product_Price2.getText();
		System.err.println("Price Of 2 Product :"+product_Price2);
		Common.log("Click on Update Quantity :"+product_Price2);
				
		
		if(product_Price1!=product_Price2) {
			
			System.err.println("Product 1 Value: "+product_Price1);
			System.err.println("Product 1 Value: "+product_Price2);
			
			Common.log("Value Differ when Quantity Increase");
			return true;
		}
		
		Common.log("Value Does Differ when Quantity Increase");
		
		return false;
	}

	/*
	 * Verifying the Price of Product with the Price at the time of Payment
	 */
	public boolean  Review_and_Purchase()
	{
		Common.pause(10);
		
		WebElement Product_Price2 = driver.findElement(By.xpath(".//tr[@class='total_price total_item']/td[2]/span//span"));
		String product_Price2 = Product_Price2.getText();
		System.err.println("Original Price Of Product :"+product_Price2);
		Common.log("Original Price Of Product :"+product_Price2);
		
		Common.pause(10);
		
		System.out.println();
		String price3 = product_Price2.replace("$" , "").trim();
		String price03 = price3.replace("," , "").trim();
		System.err.println("Converting String to Int of Original Price : "+price3);
		System.err.println("Converting String to Int of Original Price: "+price03);
		Common.log("Converting String to Int of Original Price : "+price03);
		
		double productprice3 = new Double(price03);
		int productprice3_change=(int)productprice3;
		
		Common.pause(10);
		
		System.out.println();
		List<WebElement> total_shipping = driver.findElements(By.xpath(".//span[@class='pricedisplay checkout-shipping']//span[contains(.,'')]"));
		String price = total_shipping.get(0).getText();
		System.err.println("Shipping Price of Product : "+price);
		Common.log("Shipping Price of Product : "+price);
		
		Common.pause(10);
		
		System.out.println();
		String price2 = price.replace("$" , "").trim();
		String price04 = price2.replace(",", "").trim();
		System.err.println("Converting Shipping Price from String to Int : "+price2);
		System.err.println("Converting Shipping Price from String to Int : "+price04);
		Common.log("Converting Shipping Price from String to Int : "+price04 );
		
		/*
		 * Converting Double into int
		 */
		
		double productprice2 = new Double(price04);
		int productprice2_change=(int)productprice2;
		
		Common.pause(10);
		
		System.out.println();
		WebElement ReviewandPurchase=driver.findElement(By.xpath(".//span[@id='checkout_total']//span[contains(text(),'')]"));
		String Total_Price = ReviewandPurchase.getText();
		System.out.println();
		System.err.println("Total Price of Product NEW After Adding General Price and Shipping Price :"+Total_Price);
		Common.log("Total Price of Product NEW After Adding General Price and Shipping Price :"+Total_Price);
		
		Common.pause(10);
		
		System.out.println();
		String price4 = Total_Price.replace("$", "").trim();
		String price05 = price4.replace(",", "").trim();
		System.err.println("Change of Original Price From String to Int :"+price4);
		System.err.println("Change of Original Price From String to Int :"+price05);
		Common.log("Change of Original Price From String to Int :"+price4);
		
		double productprice4 = new Double(price05);
		int productprice4_change=(int)productprice4;
		System.err.println("Converting From Double to Int :"+productprice4_change);
		
		Common.pause(10);
		
		System.out.println();
		int change_price1=productprice3_change+productprice2_change;
		System.out.println("Total Price of Final Product after including Shipping Charges and Price of Product :"+change_price1);
		
		Common.pause(10);
		
		System.out.println();
		if(change_price1==productprice4) 
		{	
			System.err.println("Price of Product Matches");
			Common.log("Price of Product Matches");
			return true;
		}
			else 
		{	
			System.err.println("Price of Product Selected and Purchase did not Match");
			Common.log("Price of Product Selected and Purchase did not Match");
			
			return false;
		}
		
	}
	
	public boolean Transaction_Result() {
		
		Common.pause(10);
		
		WebElement transaction_page = driver.findElement(By.xpath(".//h1[contains(.,'')]"));
		
		if(transaction_page.isDisplayed())
		{
			Common.log("Inside Transcation Page :"+transaction_page.getText());
			System.err.println("Inside Transcation Page :"+transaction_page.getText());
			System.out.println(transaction_page.getText());
			
			return true;
			
		}
			else 
		{	
			Common.log("Not Inside transaction Page");
			System.err.println("Not Inside transaction Page");
			
			return false;
		}
	}
}
		
		
		
		
		
		
		
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * public boolean verifyDashboardPage() {
	 * 
	 * WebElement dashboardButton =
	 * driver.findElement(By.xpath(".//div//li/a[text()='My Holdings']")); return
	 * dashboardButton.isDisplayed();
	 * 
	 * }
	 */

