package Utilities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    static AppiumDriver driver;
    static DesiredCapabilities capabilities;
    public static AppiumDriver getDriver()
    {
        if (driver == null) {

            capabilities = new DesiredCapabilities();

            capabilities.setCapability("deviceName", "Redmi Note 9");
            capabilities.setCapability("udid", "0561a2860405");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "11.0");
            capabilities.setCapability("skipUnlock", "true");
            capabilities.setCapability("appPackage", "org.studionord.a101");
            capabilities.setCapability("appActivity", "org.studionord.a101.MainActivity");
            capabilities.setCapability("skipDeviceInitialization", "true");

            try {
                driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
     return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
