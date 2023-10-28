package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class dockerwithfirefox {

	@Test
	public void firefoxtest() throws Exception {

		  URL dockerUrl = new URL("http://localhost:4444/wd/hub");
	        FirefoxOptions options = new FirefoxOptions();
	        RemoteWebDriver driver = new RemoteWebDriver(dockerUrl, options);       
	        driver.get("https://www.myntra.com/");
	        System.out.println(driver.getTitle());
	        driver.quit();
	}

}
