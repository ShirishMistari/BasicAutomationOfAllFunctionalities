package FrameWork.pageObjectDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork.AbstractComponents.AbstractComponent;

public class LoginPageLanding extends AbstractComponent {
	WebDriver driver;

	// WebElement userEmails = driver.findElement(By.id("userEmail"));
	// PageFactory
	public LoginPageLanding(WebDriver driver) {
		super(driver); // Sending child class driver to parent......
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userEmail") // How these methods nows where is driver and how it will run??
	WebElement userEmails;

	@FindBy(id = "userPassword")
	WebElement passwordss;

	@FindBy(css = "[class*='flyInOut']")
	WebElement ErrorMessage;

	@FindBy(id = "login")
	WebElement ClickButton;

	public ProductCatalogues logInCredentiales(String email, String password) {
		userEmails.sendKeys(email);
		passwordss.sendKeys(password);
		ClickButton.click();
		ProductCatalogues productCatalog = new ProductCatalogues(driver);
		return productCatalog;
	}

	public String getErrorMessage() {
		WaitForWebElementto(ErrorMessage);
		return ErrorMessage.getText();

	}

	public void getTheURL() {
		driver.get("https://rahulshettyacademy.com/client");
		// driver.manage().window().maximize();
	}
}
