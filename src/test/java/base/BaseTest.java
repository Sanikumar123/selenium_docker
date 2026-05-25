package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.DriverFactory;

public class BaseTest {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {

        driver.set(DriverFactory.getDriver(browser));
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void teardown() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}