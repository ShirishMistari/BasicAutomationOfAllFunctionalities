package ShirishAcademy.pageObjectDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShirishAcademy.AbstractComponents.AbstractComponent;

public class ProductCatalogues extends AbstractComponent {
	WebDriver driver;

	// WebElement userEmails = driver.findElement(By.id("userEmail"));
	// PageFactory
	public ProductCatalogues(WebDriver driver) {
		super(driver); // Sending child class driver to parent...
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".mb-3") // How these methods nows where is driver and how it will run??
	List<WebElement> products;

	@FindBy(css = ".ng-animating")
	WebElement toastConElement;

	By products1 = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-Type");
	By waitForToastContainer = By.cssSelector("#toast-container");

	public List<WebElement> getTheListOfProducts() {
		waitForLoadingTheProducts(products1);
		return products;
	}

	public WebElement getProductName(String ProductsNames) {
		WebElement prod = getTheListOfProducts().stream()
				.filter(productss -> productss.findElement(By.cssSelector("b")).getText().equals(ProductsNames))
				.findFirst().orElse(null);
		return prod;
		// retriveProducts.findElement(addToCart).click();
	}

	public void addToCartProduct(String ProductsNamess) throws InterruptedException {
		WebElement prod = getProductName(ProductsNamess);
		prod.findElement(addToCart).click();
		waitForLoadingTheProducts(waitForToastContainer);
		// waitTillInvisibilityOfProduct(toastConElement);
		waitTillInvisibilityOfProduct();

	}

}
