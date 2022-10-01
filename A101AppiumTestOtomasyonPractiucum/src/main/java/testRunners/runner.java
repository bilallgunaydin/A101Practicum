package testRunners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;
import Utilities.Driver;

@CucumberOptions(
        tags = "@Cart",
        features = {"src/test/java"},
        glue = {"stepDefinitions"},

        plugin = {"pretty",
                "html:target/site/cucumber-pretty.html",
                "json:target/cucumber.json", "html:target/cucumber.html", "usage:target/cucumber-usage.json", "" +
                "junit:target/cucumber-results.xml"},
        dryRun = false
)
public class runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = Driver.getDriver();

    @BeforeSuite
    public void beforeSuite() {
    }

    @BeforeTest()
    public void beforeTest() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @BeforeGroups
    public void beforeGroup() {
    }

    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
    }

    @AfterTest
    public void afterTest() {
    }

    @AfterSuite
    public void afterSuite() {
    }

    @AfterGroups
    public void afterGroup() {
    }
}
