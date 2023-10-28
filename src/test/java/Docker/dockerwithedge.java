package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class dockerwithedge {

	@Test
	public void edgetest() throws Exception{
		URL dockerUrl = new URL("http://localhost:4444/wd/hub");
        EdgeOptions options = new EdgeOptions();
        RemoteWebDriver driver = new RemoteWebDriver(dockerUrl, options);       
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        driver.quit();
	}

}
