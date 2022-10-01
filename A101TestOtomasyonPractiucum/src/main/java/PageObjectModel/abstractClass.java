package PageObjectModel;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public abstract class abstractClass {
    private WebDriver driver= Driver.getDriver();

    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickFunction(WebElement clickElement)
    {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement,String value)
    {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown, String element)
    {
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }
    public void Assertion(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));

        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message: "+actual.getText());
    }
    public void Assertion(int actual, String expected) {

        Assert.assertEquals(actual,actual,expected);
        System.out.println("My Message : "+expected);
    }
    public void Assertion(String sended, String check) {

        Assert.assertEquals(sended,check);
        System.out.println("My Message : "+check);
    }
    public void Assertions(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));

        Assert.assertEquals(actual.getAttribute("validationMessage"),expected);
        System.out.println("My Message: "+actual.getAttribute("validationMessage"));
    }
}
