package pages;

import Utilities.ElementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class FirstCase {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public FirstCase(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    By clickCancelElement = By.id("android:id/button2");

    public void clickNoUpdate() throws InterruptedException {
        Thread.sleep(5000);
        elementHelper.click(clickCancelElement);
    }

    By clickMainMenuElement = By.xpath("//android.widget.TextView");

    public void clickMainMenu() throws InterruptedException {
        Thread.sleep(1000);
        elementHelper.click(clickMainMenuElement);
    }

    By ClothingAndAccessoriesElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"GİYİM & AKSESUAR\")");

    public void clickClothingAndAccessories() throws InterruptedException {
        Thread.sleep(1000);
        elementHelper.click(ClothingAndAccessoriesElement);
    }

    By clickWomanUnderWearClothesElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kadın İç Giyim\")");

    public void clickWomanUnderWearClothes() throws InterruptedException {
        Thread.sleep(1000);
        elementHelper.click(clickWomanUnderWearClothesElement);
    }

    By clickSocksBelowTheKneeElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dizaltı Çorap\")");

    public void clickSocksBelowTheKnee() throws InterruptedException {
        Thread.sleep(1000);
        elementHelper.click(clickSocksBelowTheKneeElement);
    }

    By clickFilterButtonElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");

    public void clickFilterButton() {
        elementHelper.click(clickFilterButtonElement);
    }

    By clickBlackButtonElement = By.xpath("//android.view.ViewGroup[5]/android.view.ViewGroup[3]");

    public void clickBlackButton() {
        elementHelper.click(clickBlackButtonElement);
    }

    By clickBlackWearElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup");

    public void clickBlackSock() {
        elementHelper.click(clickBlackWearElement);
    }

    By checkBlackElement = By.xpath("//android.widget.TextView[1]");

    public void checkBlack() {
        String color = "Siyah";
        boolean result = elementHelper.checkElementWithTextTrueOrFalse(checkBlackElement, color);
        if (result)
            System.out.println("Ürün rengi: " + color);
    }

    By clickBasketElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"SEPETE EKLE\")");

    public void clickBasket() {
        elementHelper.click(clickBasketElement);
    }

    By clickShowBasketElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"SEPETE GİT\")");

    public void showBasket() {
        elementHelper.click(clickShowBasketElement);
    }

    By clickAcceptBasketElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"SEPETİ ONAYLA\")");

    public void acceptBasket() {
        elementHelper.click(clickAcceptBasketElement);
    }

    By clickNextWithoutMemberElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"ÜYE OLMADAN DEVAM ET\")");

    public void nextWithoutBeMember() {
        elementHelper.click(clickNextWithoutMemberElement);
    }

    By emailElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    public void typeEmail() {
        String emailAddress = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (emailAddress.length() < 5) {
            int character = (int) (Math.random() * 26);
            emailAddress += alphabet.substring(character, character + 1);
            emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
            emailAddress += "@" + "TestA101.com";
        }
        elementHelper.sendKey(emailElement, emailAddress);
    }

    By clickKvkkCheckBoxElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");

    public void clickKVKK() {
        elementHelper.click(clickKvkkCheckBoxElement);
    }

    By clickSendButtonElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"GÖNDER\")");

    public void send() {
        elementHelper.click(clickSendButtonElement);
    }

    By cookieElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"KABUL ET\")");

    public void clickAcceptCookie() {
        elementHelper.click(cookieElement);
    }

    By createAddressElement = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Yeni adres oluştur\")");

    public void createAddress() {
        elementHelper.click(createAddressElement);
    }

    By addressTitleElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText");

    public void typeAddressTitle(String addressTitle) {
        elementHelper.sendKey(addressTitleElement, addressTitle);
    }

    By firstNameElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText");

    public void typeFirstName(String firstName) {
        elementHelper.sendKey(firstNameElement, firstName);
    }

    By lastNameElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText");

    public void typeLastName(String lastName) {
        elementHelper.sendKey(lastNameElement, lastName);
    }

    By phoneNumberElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.widget.EditText");

    public void typePhoneNumber(long phoneNumber) {
        elementHelper.sendKey(phoneNumberElement, String.valueOf(phoneNumber));
    }

    By addressElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[10]/android.view.View/android.widget.EditText");

    public void typeAddress(String address) {
        elementHelper.sendKey(addressElement, address);
    }

    By clickcityElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Seçiniz\")");
    By selectCityElement;

    public void selectCity(String city) {
        elementHelper.click(clickcityElement);
        selectCityElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + city + "\")");
        elementHelper.click(selectCityElement);
    }

    By clickTownElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Seçiniz\")");
    By selectTownElement;

    public void selectTown(String town) throws InterruptedException {
        Thread.sleep(1000);
        elementHelper.click(clickTownElement);
        selectTownElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + town + "\")");
        elementHelper.click(selectTownElement);
    }

    By clickNeighbourhoodElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Seçiniz\")");
    By selectNeighbourhoodeElement;

    public void selectNeighbourhoodelemnt(String neighbourhood) throws InterruptedException {
        Thread.sleep(1000);
        elementHelper.click(clickNeighbourhoodElement);
        selectNeighbourhoodeElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + neighbourhood + "\")");
        elementHelper.click(selectNeighbourhoodeElement);
    }


    By scrollElement = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"KAYDET\").instance(0))");

    public void clickSaveButton() {
        elementHelper.click(scrollElement);
    }

    By clickCargoCampanyElement = By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]");

    public void clickCargoCompany() {
        elementHelper.click(clickCargoCampanyElement);
    }

    By clickSaveAndContinueButtonElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kaydet ve Devam Et\")");

    public void clickSaveAndContinue() {
        elementHelper.click(clickSaveAndContinueButtonElement);
    }

    By clickCompleteOrderButtonElement = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Siparişi Tamamla\")");

    public void clickCompleteOrder() {
        elementHelper.click(clickCompleteOrderButtonElement);
    }

    By checkOrderMessage = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kart ile ödeme\")");

    public void assertMyMessage(String message) {

        boolean result = elementHelper.checkElementWithTextTrueOrFalse(checkOrderMessage, message);
        if (result)
            System.out.println("Ödeme Ekranına Gelindiğinin Kontrolü: " + message);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
