package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FirstCase_Test extends abstractClass {

    private WebDriver driver;

    public FirstCase_Test() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement cookieElement;

    public void clickAcceptCookie() {
        clickFunction(cookieElement);
    }

    @FindBy(xpath = "//a[contains(text(),'Giyim & aksesuar')]")
    private WebElement accessoryElement;

    public void clickApparalAndAccessory() throws InterruptedException {

        clickFunction(accessoryElement);
    }

    @FindBy(linkText = "Kadın İç Giyim")
    private WebElement womanUnderWearElement;

    public void clickWomanUnderWear() {
        clickFunction(womanUnderWearElement);
    }

    @FindBy(xpath = "//body/section[1]/section[4]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement socksBelowTheKneeElement;

    public void clickSocksBelowTheKnee() {
        clickFunction(socksBelowTheKneeElement);
    }

    @FindBy(xpath = "/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[2]/ul[3]/li[2]/label")

    private WebElement blackElement;

    public void clickBlackCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        clickFunction(blackElement);
    }

    @FindBy(xpath = "/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3")
    private WebElement blackSocksElement;

    public void clickBlackSock() throws InterruptedException {
        Thread.sleep(2000);
        clickFunction(blackSocksElement);
    }

    @FindBy(xpath = "//body/section[1]/section[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    private WebElement controlBlackElement;

    public void checkBlack() {
        Assertion(controlBlackElement, "Seçılen Renk: SİYAH");
    }

    @FindBy(xpath = "/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button")
    private WebElement basketElement;

    public void clickBasket() {
        clickFunction(basketElement);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[3]/a[3]")
    private WebElement showTheBasketElement;

    public void showBasket() {
        clickFunction(showTheBasketElement);
    }

    @FindBy(xpath = "/html/body/section/div[1]/div[2]/div/div[2]/div/a")
    private WebElement acceptBasketElement;

    public void acceptBasket() {
        clickFunction(acceptBasketElement);
    }

    @FindBy(xpath = "//a[contains(text(),'ÜYE OLMADAN DEVAM ET')]")
    private WebElement withoutBeMemberElement;

    public void nextWithoutBeMember() {
        clickFunction(withoutBeMemberElement);
    }

    @FindBy(name = "user_email")
    private WebElement emailElement;

    public void typeEmail() {
        String emailAddress = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (emailAddress.length() < 5) {
            int character = (int) (Math.random() * 26);
            emailAddress += alphabet.substring(character, character + 1);
            emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
            emailAddress += "@" + "TestA101.com";
        }
        sendKeysFunction(emailElement, emailAddress);
    }

    @FindBy(xpath = "//button[contains(text(),'DEVAM ET')]")
    private WebElement continueElement;

    public void continueNext() {
        clickFunction(continueElement);
    }

    @FindBy(xpath = "//body/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[2]/li[1]/a[1]")
    private WebElement createAddressElement;

    public void createAddress() {
        clickFunction(createAddressElement);
    }

    @FindBy(name = "title")
    private WebElement addressTitleElement;

    public void typeAddressTitle(String addressTitle) {
        sendKeysFunction(addressTitleElement, addressTitle);
    }

    @FindBy(name = "first_name")
    private WebElement firstNameElement;

    public void typeFirstName(String firstName) {
        sendKeysFunction(firstNameElement, firstName);
    }

    @FindBy(name = "last_name")
    private WebElement lastNameElement;

    public void typeLastName(String lastName) {
        sendKeysFunction(lastNameElement, lastName);
    }

    @FindBy(name = "phone_number")
    private WebElement phoneNumberElement;

    public void typePhoneNumber(long phoneNumber) {
        sendKeysFunction(phoneNumberElement, String.valueOf(phoneNumber));
    }

    @FindBy(xpath = "//body/div[@id='js-orders-modal-container']/div[1]/div[2]/form[1]/div[7]/label[1]/textarea[1]")
    private WebElement addressElement;

    public void typeAddress(String address) {
        sendKeysFunction(addressElement, address);
    }

    @FindBy(name = "city")
    private WebElement cityElement;

    public void selectCity(String city) {
        selectElementFromDropdown(cityElement, city);
    }

    @FindBy(name = "township")
    private WebElement townElement;

    public void selectTown(String town) {
        selectElementFromDropdown(townElement, town);
    }

    @FindBy(name = "district")
    private WebElement neighbourhoodElement;

    public void selectNeighbourhoodelemnt(String Neighbourhood) throws InterruptedException {
        Thread.sleep(2000);
        selectElementFromDropdown(neighbourhoodElement, Neighbourhood);
    }


    @FindBy(xpath = "/html/body/div[1]/div/div[2]/form/button[1]")
    private WebElement saveElement;

    public void clickSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        clickFunction(saveElement);
    }

    @FindBy(css = "label[class='js-checkout-cargo-item'] div[class='radio']")
    private List<WebElement> element;

    public void clickCargoCompany() {
        element = driver.findElements(By.cssSelector("label[class='js-checkout-cargo-item'] div[class='radio']"));
        element.get(0).click();
    }

    @FindBy(xpath = "//body[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")
    private WebElement saveAndContinueElement;

    public void clickSaveAndContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickFunction(saveAndContinueElement);
    }

    @FindBy(xpath = "/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button")
    private WebElement completeOrderElement;

    public void clickCompleteOrder() {
        clickFunction(completeOrderElement);
    }

    @FindBy(xpath = "//div[contains(text(),'Kart ile ödeme')]")
    private WebElement successMessage;

    public void assertMyMessage(String messsage) {
        Assertion(successMessage, messsage);
    }

}
