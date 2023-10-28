package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class dockerwithchrome {

	@Test
    public void chrometest() throws Exception {
        URL dockerUrl = new URL("http://localhost:4444/wd/hub");
        ChromeOptions options = new ChromeOptions(); 
        RemoteWebDriver driver = new RemoteWebDriver(dockerUrl, options);       
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        driver.quit();

    }

}
