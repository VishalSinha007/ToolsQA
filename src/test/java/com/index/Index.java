package com.index;

import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;

public class Index extends SeleniumInit{
	
	@Test
	public void Draggable() {
		
		int steps =1;
		
		Common.logcase("To Verify that user is Redirected to the ToolsQA Application</br></br>");
		
		Common.logstep("Step :"+steps+++" .Open the Url</br></br>");
		
		boolean tf = generalVerification.homepageverification();
		
		if(tf)
			Common.log("===>Home page is opened</br></br>");
		else
			Common.log("Home page is NOT opened</br></br>");
		
		
		Common.logcase("Open the ToolsQA WebSite and Click on the Link");
		
		Common.logstep("Steps :"+steps+++" Click on DEMO SITE under ToolsQA Application </br></br>");
		generalVerification = generalIndexpage.click_on_DemoSite();
		
		Common.logstep("Steps :"+steps+++" Click on E-Commerce Demo Site under DEMO SITE in ToolsQA Application </br></br>");
		generalVerification = generalIndexpage.E_Commerce_Demo_Site_Click();
		
		
		/*
		 * E-Commerce Site Page
		 */

		Common.logcase("To Verify that user is Redirected to the ToolsQA Application</br></br>");
		
		Common.logstep("Step :"+steps+++" .Open the E-Commmerce Url</br></br>");
		
		boolean title_Verify = generalVerification.Verify_Ecommerce_Title();
		
		if(title_Verify)
			Common.log("===>E-Commerce page is opened</br></br>");
		else
			Common.log("E-Commerce page is NOT opened</br></br>");
		
		
		Common.logstep("Steps :"+steps+++" Click on Product Category option under E-Commerce Demo Site </br></br>");
		generalVerification = generalIndexpage.Product_Category();
		
		
		Common.logstep("Steps :"+steps+++" Click on iPads options under Product Category option inside E-Commerce Demo Site </br></br>");
		generalVerification = generalIndexpage.iPads();
		
		Common.logstep("Steps :"+steps+++" Click on Any iPads And Click on Add To Cart Button </br></br>");
		generalVerification = generalIndexpage.Add_to_Cart();
		
		Common.logstep("Steps :"+steps+++" Click on Add to Cart and Check that the Item has been Added or Not </br></br>");
		generalVerification = generalIndexpage.Checkout();
		
		
		Common.logcase("Verify the Item inside the Cart");
		
		Common.logstep("Steps :"+steps+++" Verify the Item inside the Cart </br></br>");
		boolean item_verify=generalVerification.Cart_Item_Verify();
		
		if(item_verify)
			Common.log("====>Item Verified in the Cart ");
		else
			Common.log("====>Item not Verified in the Cart ");
		
		
		Common.logstep("Steps :"+steps+++" Increase the Number of Quantity of the Product  </br></br>");
		generalVerification = generalIndexpage.Quantity_of_Product();
		
		
		Common.logstep("Steps :"+steps+++" Increase the Number of Quantity of the Product and Click on Update  </br></br>");
		generalVerification = generalIndexpage.Update();
		
		
		Common.logcase("Quantity Increases Price Increse Too");
		
		Common.logstep("Steps :"+steps+++" Verify that when quantity increase price also increase </br></br>");
		boolean Quantity_Price_Verification=generalVerification.Quantity_Price_Verification();
		
		if(Quantity_Price_Verification)
			Common.log("====>Price Increase ");
		else
			Common.log("====>Price do not increase");
		
		
		Common.logstep("Steps :"+steps+++" Click on Continue after clicking the Item into the Cart </br></br>");
		generalVerification = generalIndexpage.Continue();
		
		Common.logstep("Steps :"+steps+++" Type the email id you want to send Mail </br></br>");
		generalVerification = generalIndexpage.enter_email();
		
		Common.logstep("Steps :"+steps+++" Type the First Name </br></br>");
		generalVerification = generalIndexpage.First_Name();
		
		Common.logstep("Steps :"+steps+++" Type the Last Name </br></br>");
		generalVerification = generalIndexpage.Last_Name();
		
		Common.logstep("Steps :"+steps+++" Type the Address </br></br>");
		generalVerification = generalIndexpage.Address();
		
		Common.logstep("Steps :"+steps+++" Type the City Name </br></br>");
		generalVerification = generalIndexpage.City();
		
		Common.logstep("Steps :"+steps+++" Type the State Name </br></br>");
		generalVerification = generalIndexpage.State();
		
		Common.logstep("Steps :"+steps+++" Select the Country Name From the Drop Down </br></br>");
		generalVerification = generalIndexpage.Country();
		
		Common.logstep("Steps :"+steps+++" Type the Pin Code of the State </br></br>");
		generalVerification = generalIndexpage.Pin_Code();
		
		Common.logstep("Steps :"+steps+++" Type the Phone Number of yours </br></br>");
		generalVerification = generalIndexpage.PhoneNumber();
		
		Common.logstep("Steps :"+steps+++" Select Shipping Address same </br></br>");
		generalVerification = generalIndexpage.Same_as_Shipping_address();
		
		
		Common.logcase("Verifying the Price of Product Selected and Final Purchase Price");
		
		Common.logstep("Steps :"+steps+++" Verify that when quantity increase price also increase </br></br>");
		boolean ReviewandPurchase=generalVerification.Review_and_Purchase();
		
		if(ReviewandPurchase)
			Common.log("====>Price Matched ");
		else
			Common.log("====>Price did not Match");
		
		Common.logstep("Steps :"+steps+++" Click on Purchase Button  </br></br>");
		generalVerification = generalIndexpage.Purchase_Button();
		
		
		Common.logstep("Steps :"+steps+++" Verify that when quantity increase price also increase </br></br>");
		boolean transactionPage=generalVerification.Transaction_Result();
		
		if(transactionPage)
			Common.log("====>Inside Transaction Page ");
		else
			Common.log("====>Not Inside Transaction Page");
		
		
		
		
	}	
}
