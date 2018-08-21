package com.indexpage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.init.AbstractPage;
import com.init.Common;
import com.verification.GeneralVerification;


/**
 * @author Vishal
 *
 */
public class GeneralIndexpage  extends AbstractPage{
	
	public static String email="sinha.vishal292@gmail.com";
	public static String first_name="Vishal";
	public static String last_name="Sinha";
	public static String address="XYZ";
	public static String city="Ahmedabad";
	public static String state="Gujrat";
	public static String country="India";
	public static String postal_code="380005";
	public static String phone_number="1234567890";

	public GeneralIndexpage(WebDriver driver) {
		super(driver);
	}

	
	public GeneralVerification click_on_DemoSite() {
		
		Common.pause(5);
		
		 List<WebElement> click_on_Demo_Site = driver.findElements(By.xpath(".//span[contains(text(),'DEMO SITES')]"));	//.//ul[@id='primary-menu']//li//a//span[text()='DEMO SITES']
		 click_on_Demo_Site.get(0).click();
		
		return new GeneralVerification(driver);
		
	}
	
	
	@FindBy(xpath=".//ul[@id='primary-menu']//li//a//span[text()='E-Commerce Demo Site']")
	private WebElement E_Commerce_Demo_Site;
	
	public GeneralVerification E_Commerce_Demo_Site_Click() {
		
		Common.pause(5);
		
		E_Commerce_Demo_Site.click();
		
		Common.pause(5);
		/*
		 * Switching From Parent Window to Child Window
		 */
		Common.SwitchtoTab(driver, 1);
		
	/*	for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
			System.err.println("Switching Window");
		}*/
		
		return new GeneralVerification(driver);
	}

	@FindBy(xpath="//a[contains(text(),'Product Category')]")
	private WebElement Product_Category;
	
	public GeneralVerification Product_Category() {
		
		Common.pause(15);
		
		Actions action=new Actions(driver);
		action.moveToElement(Product_Category).build().perform();
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//a[contains(text(),'iPads')]")
	private WebElement iPads;
	
	public GeneralVerification iPads() {
		
		Common.pause(15);
		
		iPads.click();
		
		return new GeneralVerification(driver);
	}
	
	
	public GeneralVerification Add_to_Cart() {
		
		Common.pause(15);
		
		List<WebElement> AddToCart = driver.findElements(By.xpath(".//input[@value='Add To Cart' and @type='submit']"));
		AddToCart.get(2).click();
		String item_selected = AddToCart.get(2).getText();
		System.err.println(item_selected);
		Common.log(item_selected);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//a[text()='Checkout']")
	private WebElement Checkout;
	
	public GeneralVerification Checkout() {
		
		Common.pause(5);
		
		Checkout.click();
		 
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@type='text' and @name='quantity']")
	private WebElement Quantity_of_Product;
	
	public GeneralVerification Quantity_of_Product() {
		
		Common.pause(5);
		
		Quantity_of_Product.sendKeys("2");
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@type='submit' and @value='Update']")
	private WebElement Update;
	
	public GeneralVerification Update() {
		
		Common.pause(5);
		
		Update.click();
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//span[contains(.,'Continue')]")
	private WebElement Continue;
	
	public GeneralVerification Continue() {
		
		Common.pause(5);
		
		Continue.click();
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@id='wpsc_checkout_form_9' and @title='billingemail']")
	private WebElement enter_email;
	
	public GeneralVerification enter_email() {
		
		Common.pause(5);
		
		Common.mouseHover(driver, enter_email);
		//Common.scrollToVertical(driver, enter_email);
		
		enter_email.sendKeys(email);
		Common.log("====>Enter Email ID :"+email);
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//input[@id='wpsc_checkout_form_2' and @placeholder='First Name']")
	private WebElement First_Name;
	
	public GeneralVerification First_Name() {
		
		Common.pause(5);
		
		First_Name.sendKeys(first_name);
		Common.log("====>Enter First Name :"+first_name);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@id='wpsc_checkout_form_3' and @placeholder='Last Name']")
	private WebElement Last_Name;
	
	public GeneralVerification Last_Name() {
		
		Common.pause(5);
		
		Last_Name.sendKeys(last_name);
		Common.log("====>Enter Last Name :"+last_name);
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//textarea[@title='billingaddress']")
	private WebElement Address;
	
	public GeneralVerification Address() {
		
		Common.pause(5);
		
		Address.sendKeys(address);
		Common.log("====>Enter Address :"+address);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@title='billingcity']")
	private WebElement City;
	
	public GeneralVerification City() {
		
		Common.pause(5);
		
		City.sendKeys(city);
		Common.log("====>Enter City Name :"+city);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@title='billingstate']")
	private WebElement State;
	
	public GeneralVerification State() {
		
		Common.pause(5);
		
		State.sendKeys(state);
		Common.log("====>Enter State Name :"+state);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//select[@title='billingcountry']")
	private WebElement Country;
	
	public GeneralVerification Country() {
		
		Common.pause(5);
		
		Select select=new Select(Country);
		select.selectByVisibleText(country);
		Common.log("====>Enter Country Name :"+country);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@title='billingpostcode']")
	private WebElement Pin_Code;
	
	public GeneralVerification Pin_Code() {
		
		Common.pause(5);
		
		Pin_Code.sendKeys(postal_code);
		Common.log("====>Enter Postal Code :"+postal_code);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@title='billingphone']")
	private WebElement PhoneNumber;
	
	public GeneralVerification PhoneNumber() {
		
		Common.pause(5);
		
		PhoneNumber.sendKeys(phone_number);
		Common.log("====>Enter Phone Number :"+phone_number);
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//input[@id='shippingSameBilling']")
	private WebElement Same_as_billing_address;
	
	public GeneralVerification Same_as_Shipping_address() {
		
		Common.pause(5);
		
		Same_as_billing_address.click();
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//input[@value='Purchase' and @type='submit']")
	private WebElement Purchase_Button;
	
	public GeneralVerification Purchase_Button() {
		
		Common.pause(5);
		
		Purchase_Button.click();
		
		return new GeneralVerification(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
}	
	

	

	
	
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
			
				
	
	/*public GeneralVerification loginAs(String emailAddress, String password) {

		txtEmailId.sendKeys(emailAddress);
		Common.pause(1);
		txtPassword.sendKeys(password);

		Common.pause(1);

		btnLogin.click();

		return new GeneralVerification(driver);
	}*/
	
	
	
	
	


