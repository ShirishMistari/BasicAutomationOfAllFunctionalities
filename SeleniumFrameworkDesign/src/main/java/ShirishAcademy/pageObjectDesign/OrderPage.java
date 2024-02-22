package ShirishAcademy.pageObjectDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShirishAcademy.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent {
	WebDriver driver;

	// WebElement userEmails = driver.findElement(By.id("userEmail"));
	// PageFactory
	public OrderPage(WebDriver driver) {
		super(driver); // Sending child class driver to parent...
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".totalRow button")
	WebElement checkOutCart;

	@FindBy(css = "tr td:nth-child(3)") // How these methods nows where is driver and how it will run??
	private List<WebElement> productNames;


//	By products1 = By.cssSelector(".mb-3");
//	By addToCart = By.cssSelector(".card-body button:last-of-Type");
//	By waitForToastContainer = By.cssSelector("#toast-container");

	public Boolean verifyOrderedProducts(String ProductsNames) {
		Boolean match = productNames.stream().anyMatch(proctsss -> proctsss.getText().equalsIgnoreCase(ProductsNames));
		return match;
	}

	
}
