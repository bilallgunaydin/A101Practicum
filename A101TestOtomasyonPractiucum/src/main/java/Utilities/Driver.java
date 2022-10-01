package Utilities;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            chromeOptions.addArguments("--disable-popup-blocking");
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }

    public static void tearDown()
    {
        if(driver!=null)
        {
            driver.close();
            driver=null;
        }
    }
}
