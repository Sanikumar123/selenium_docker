package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DriverFactory {

    public static WebDriver getDriver() {
        try {
            ChromeOptions options = new ChromeOptions();
            URL gridUrl = new URL("http://localhost:4444/ui/");
            return new RemoteWebDriver(gridUrl, options);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
