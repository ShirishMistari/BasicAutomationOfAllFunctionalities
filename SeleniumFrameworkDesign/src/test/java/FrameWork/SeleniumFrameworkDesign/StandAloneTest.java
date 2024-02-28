package FrameWork.SeleniumFrameworkDesign;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork.Test.Baseclass;
import FrameWork.pageObjectDesign.CartPage;
import FrameWork.pageObjectDesign.CheckOutPage;
import FrameWork.pageObjectDesign.ConfirmOrder;
import FrameWork.pageObjectDesign.OrderPage;
import FrameWork.pageObjectDesign.ProductCatalogues;

public class StandAloneTest extends Baseclass {
	String ProductsNames = "ZARA COAT 3";
	@Test(dataProvider = "getTheData", groups = {"Purchase"})
	public void SubmitOrder(HashMap<String, String> input) throws InterruptedException {
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		ProductCatalogues productCataloguess = landingPage.logInCredentiales(input.get("email"), input.get("password"));
		List<WebElement> products = productCataloguess.getTheListOfProducts();
		productCataloguess.addToCartProduct(input.get("ProductName"));
		CartPage cartpages = productCataloguess.clickOnCart();
		Boolean match = cartpages.verifyProductDisplay(input.get("ProductName"));
		Assert.assertTrue(match);
		CheckOutPage checkOutPage = cartpages.gotoCartCheckOut();
		checkOutPage.selectCountry("india");
		ConfirmOrder confirmOrder = checkOutPage.submitOrder();
		String getConfirmationMessage = confirmOrder.getConfirmationMessages();
		Assert.assertTrue(getConfirmationMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		System.out.println(getConfirmationMessage);
	}
	
	@Test(dependsOnMethods = {"SubmitOrder"})
	public void OrderHistoryPage() {
		ProductCatalogues productCataloguess = landingPage.logInCredentiales("Sm123@gmail.com", "Chetna!123");
		OrderPage orderpage = productCataloguess.ClickOnOrderLink();
		Assert.assertTrue(orderpage.verifyOrderedProducts(ProductsNames));
	}
	// First Way to create json
//	@DataProvider
//	public Object[][] getTheData(){
//		return new Object[][] { {"Sm123@gmail.com","Chetna!123","ZARA COAT 3"}, {"Sona1@gmail.com","D@12345","ADIDAS ORIGINAL"} };
//	}
	
	//Second Way to create json
	    @DataProvider
	    public Object getTheData() throws IOException{
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("email","Sm123@gmail.com");
//		map.put("password","Chetna!123");
//		map.put("ProductName","ZARA COAT 3");
//		
//		HashMap<String, String> map1 = new HashMap<String, String>();
//		map1.put("email","Sona1@gmail.com");
//		map1.put("password","D@12345");
//		map1.put("ProductName","ADIDAS ORIGINAL");
		 List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+ "\\src\\test\\java\\ShirishAcademy\\data\\PurchaseOrderData.json");
	   	 return new Object[][] { {data.get(0)},{data.get(1)} };
		
	}
	
}
