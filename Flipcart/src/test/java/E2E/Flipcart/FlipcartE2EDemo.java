package E2E.Flipcart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.*;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.*;
import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartE2EDemo {

	static WebDriver driver;

	public static void main(String str[]) throws InterruptedException {
		test(driver);
	}

	//// a[contains(text(),'All-Day Active SlipOn Sneakers For Men')]
	@Test
	public static void test(WebDriver driver) throws InterruptedException {
		// Register with RahulShetty Academy..................Scenario1

		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.get("https://rahulshettyacademy.com/client");
		 * driver.manage().window().maximize(); WebElement ragister =
		 * driver.findElement(By.xpath("//a[text()='Register here']"));
		 * ragister.click(); WebElement name =
		 * driver.findElement(By.xpath("//input[@type='firstName']"));
		 * name.sendKeys("niktt1"); WebElement lastname =
		 * driver.findElement(By.xpath("//input[@type='lastName']"));
		 * lastname.sendKeys("sutartt"); WebElement email =
		 * driver.findElement(By.xpath("//input[@type='email']"));
		 * email.sendKeys("s1o3410@gmail.com"); WebElement mobilen =
		 * driver.findElement(By.xpath("//input[@placeholder='enter your number']"));
		 * mobilen.sendKeys("9834773343"); WebElement occu =
		 * driver.findElement(By.xpath("//select[@formcontrolname='occupation']"));
		 * Select s = new Select(occu); s.selectByValue("3: Engineer"); WebElement
		 * selecrgender = driver.findElement(By.xpath("//input[@value='Male']"));
		 * selecrgender.click(); WebElement pass =
		 * driver.findElement(By.xpath("//input[@placeholder='Passsword']"));
		 * pass.sendKeys("Sss@#12345"); WebElement confiP =
		 * driver.findElement(By.xpath("//input[@placeholder='Confirm Passsword']"));
		 * confiP.sendKeys("Sss@#12345"); WebElement selecCh =
		 * driver.findElement(By.xpath("//div[text()=' I am 18 year or Older ']"));
		 * driver.findElement(with(By.tagName("input")).toLeftOf(selecCh)).click();
		 * WebElement clickOnRagister =
		 * driver.findElement(By.xpath("//input[@value='Register']"));
		 * clickOnRagister.click(); WebDriverWait w = new WebDriverWait(driver,
		 * Duration.ofSeconds(10));
		 * w.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//h1[text()='Account Created Successfully']"))); WebElement
		 * successfullL =
		 * driver.findElement(By.xpath("//h1[text()='Account Created Successfully']"));
		 * String responseM = successfullL.getText(); String responseMessage =
		 * "Account Created Successfully"; System.out.println(responseM); if
		 * (responseM.equalsIgnoreCase(responseMessage)) { Assert.assertTrue(true); }
		 */

		// Login With ragistered username & password...........Scenario..
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
//		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
//		login.click();
		WebElement e = driver.findElement(By.xpath("//input[@type='email']"));
		e.sendKeys("s1o3410@gmail.com");
		WebElement p = driver.findElement(By.xpath("//input[@type='password']"));
		p.sendKeys("Sss@#12345");
		WebElement click = driver.findElement(By.xpath("//input[@name='login']"));
		click.click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".mb-3")));
//		List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@class='card-body']//b"));
//		List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='card-body']//button[text()=' Add To Cart']"));

		String expectedProductName = "ZARA COAT 3";

		// Find all product elements
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='card']"));

		// Loop through each product
		for (WebElement product : productList) {
			try {
			// Extract the product name
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card']//b[text()='ZARA COAT 3']")));
			WebElement productName = product.findElement(By.xpath("//div[@class='card']//b[text()='ZARA COAT 3']"));

              System.out.println(productName);
			// Check if the current product matches the expected product name
			if (productName.equals(expectedProductName)) {
				// Click on the "Add to Cart" button for this product
				product.findElement(By.cssSelector("//button[text()=' Add To Cart']")).click();

				// Wait for the cart confirmation or any other relevant action
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

				// Exit the loop since we've found and added the desired product
				break;
			}
		}
	      catch (org.openqa.selenium.StaleElementReferenceException pp) {
           // Element is stale, re-locate the element and retry
           productList = driver.findElements(By.xpath("//div[@class='card']"));
       }

	}
	}
}

	
