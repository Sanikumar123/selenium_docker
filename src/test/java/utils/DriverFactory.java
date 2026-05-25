package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DriverFactory {

    public static WebDriver getDriver(String browser) {

        try {

            URL gridUrl = new URL("http://localhost:4444");

            switch (browser.toLowerCase()) {

                case "chrome":
                    return new RemoteWebDriver(gridUrl, new ChromeOptions());

                case "firefox":
                    return new RemoteWebDriver(gridUrl, new FirefoxOptions());

                default:
                    throw new RuntimeException("Invalid browser: " + browser);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}