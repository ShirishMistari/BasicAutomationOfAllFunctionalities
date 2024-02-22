package Inputs;

import org.openqa.selenium.By;

public interface Values {

	final String productName = "X-Ray Tour Open Road Sneakers For Men";
	final String input = "Puma Shoes for Men";
	final String inputXpath = "//input[@type='text']";
	final String listOfProducts = "//div[@class='_1xHGtK _373qXS']";
	final String addTocart = "//div[div[div[ul[li[button[text()='Add to cart']]]]]]/div[2]/div/ul/li[1]/button";
	final String addProductwithPlus = "//div[div[div[div[div[button[text()='+']]]]]]/div/div[2]/div[1]/div/button[2]";
	By k =  By.xpath("//div[@class='_1xHGtK _373qXS']");
	By kk = By.xpath("//div[div[div[div[a[text()='" + productName + "']]]]]/div[3]/div/div[1]");
	By oo =  By.xpath("//div[div[div[ul[li[button[text()='Add to cart']]]]]]/div[2]/div/ul/li[1]/button");
	By pp =By.xpath("//div[div[div[div[div[button[text()='+']]]]]]/div/div[2]/div[1]/div/button[2]");
	String purchaseDetailsInfo = "//div[@class='_35mLK5']";
}
