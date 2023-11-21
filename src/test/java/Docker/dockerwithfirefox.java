package Docker;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class dockerwithfirefox {

	private static void executeJavaScriptClick(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
	
	@SuppressWarnings("deprecation")
	@Test
	public void firefoxtest() throws Exception {

		  URL dockerUrl = new URL("http://localhost:4444/wd/hub");
	        FirefoxOptions options = new FirefoxOptions();
	        RemoteWebDriver driver = new RemoteWebDriver(dockerUrl, options);       
	        driver.get("https://consumer-webapp-tau.vercel.app/home");
			// Set an implicit wait for 20 seconds
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        // Click on the close icon using JavaScript
	        WebElement closeIcon = driver.findElement(By.xpath("//div[@class='close-icon']"));
	        executeJavaScriptClick(driver, closeIcon);

	        // Pause for 2 seconds (using Thread.sleep for demonstration purposes)
	        Thread.sleep(2000);

	        // Click on the cheese menu or My Account using JavaScript
	        WebElement cheeseMenu = driver.findElement(By.xpath("//img[@alt='cheese-menu'] | //span[normalize-space()='My Account']"));
	        executeJavaScriptClick(driver, cheeseMenu);

	        // Pause for 2 seconds
	        Thread.sleep(2000);

	        // Click on the Login or logout-sec using JavaScript
	        WebElement loginElement = driver.findElement(By.xpath("//h5[normalize-space()='Login'] | //div[@class='logout-sec']"));
	        executeJavaScriptClick(driver, loginElement);

	        // Pause for 2 seconds
	        Thread.sleep(2000);
			assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Request OTP'] | //button[normalize-space()='Request OTP']")).isDisplayed());
			driver.quit();
	}

}
