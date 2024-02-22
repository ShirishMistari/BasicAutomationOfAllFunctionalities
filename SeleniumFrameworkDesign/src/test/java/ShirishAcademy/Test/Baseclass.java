package ShirishAcademy.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ShirishAcademy.pageObjectDesign.LoginPageLanding;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public LoginPageLanding landingPage;

	public WebDriver initialiseDriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream path = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\ShirishAcademy\\resourses\\global.properties");
		pro.load(path);
		String browserName =System.getProperty("browser")!=null ? System.getProperty("browser") : pro.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
//			 ChromeOptions optionss = new ChromeOptions();
//			 optionss.addArguments("headless"); 
//			ChromeOptions opt = new ChromeOptions();
//			opt.addArguments("disable-infobars");
			
			driver = new ChromeDriver();   // Parameterize optionss object in this
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("WebDriver.gecko.driver","F:\\Drivers");
			driver = new FirefoxDriver();   // Firefox isn't installed in my system
			// firefox driver
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("WebDriver.edge.driver", "edge.exe");
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		return driver;
	}

	public List<HashMap<String, String>> getJsonDataToMap(String FilePath) throws IOException {
		// read json to String
		String jsonContentn = FileUtils.readFileToString(new File(FilePath), StandardCharsets.UTF_8);
		// sTRING TO hASHmAP bY jACKSON dataBind
		ObjectMapper maper = new ObjectMapper();
		List<HashMap<String, String>> data = maper.readValue(jsonContentn,
				new TypeReference<List<HashMap<String, String>>>() {

				});
		return data;

	}
	

	public String takeScreenShot(String takeScreenShot, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File fl = new File(System.getProperty("user.dir") + "\\reports\\" + takeScreenShot + ".png");
		FileUtils.copyFile(source, fl);
		return System.getProperty("user.dir") + "\\reports\\" + takeScreenShot + ".png";
	}

	@BeforeMethod
	public LoginPageLanding launchApplication() throws IOException {
		driver = initialiseDriver();
		this.landingPage = new LoginPageLanding(driver);
		landingPage.getTheURL();
		return landingPage;
	}

	@AfterMethod
	public void closeBrowser() {
		// driver.close();
	}
}
