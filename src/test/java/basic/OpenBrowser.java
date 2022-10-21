package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenBrowser {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(Browser.SAFARI.browserName());
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),desiredCapabilities);
        driver.get("https://www.google.com");


//        try{
//            Thread.sleep(5000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        driver.quit();
    }
}
