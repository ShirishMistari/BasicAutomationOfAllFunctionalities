package FrameWork.SeleniumFrameworkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import FrameWork.Test.Baseclass;
import FrameWork.pageObjectDesign.CartPage;
import FrameWork.pageObjectDesign.CheckOutPage;
import FrameWork.pageObjectDesign.ConfirmOrder;
import FrameWork.pageObjectDesign.LoginPageLanding;
import FrameWork.pageObjectDesign.ProductCatalogues;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorValidation extends Baseclass {
    
	@Test                       // retryAnalyzer= Retry.class
	public void LoginValidation() throws InterruptedException {
		String ProductsNames = "ZARA COAT 3";
		landingPage.logInCredentiales("Sm123@gmail.com", "Sm@123458788");
		Assert.assertEquals("Incorrect email password.", landingPage.getErrorMessage());
		
	}
	@Test
	public void productErrorValidations() throws InterruptedException {
		String ProductsNames = "ZARA COAT 3";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		ProductCatalogues productCataloguess = landingPage.logInCredentiales("Sona1@gmail.com", "D@12345");
		List<WebElement> products = productCataloguess.getTheListOfProducts();
		productCataloguess.addToCartProduct(ProductsNames);
		CartPage cartpages = productCataloguess.clickOnCart();
		Boolean match = cartpages.verifyProductDisplay("ZARA COAT 3");
		Assert.assertTrue(match);
	}

}
