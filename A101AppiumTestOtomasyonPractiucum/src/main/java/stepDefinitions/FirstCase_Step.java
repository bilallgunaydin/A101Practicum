package stepDefinitions;

import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.FirstCase;

public class FirstCase_Step {
    FirstCase firstCase_test = new FirstCase(Driver.getDriver());

    @And("Güncelleme Kontrol Edilir")
    public void güncellemeKontrolEdilir() throws InterruptedException {
        firstCase_test.clickNoUpdate();
    }

    @And("Menuye basılır.")
    public void menuyeBasılır() throws InterruptedException {
        firstCase_test.clickMainMenu();
    }

    @And("Giyim-Aksesuar butonuna tıklanır")
    public void giyim_aksesuar_butonuna_tıklanır() throws InterruptedException {
        firstCase_test.clickClothingAndAccessories();
    }

    @And("Kadın İç Giyim kategorisine tıklanır")
    public void kadın_iç_giyim_kategorisine_tıklanır() throws InterruptedException {
        firstCase_test.clickWomanUnderWearClothes();
    }

    @And("Dizaltı Çorap Kategorisini Seçilir")
    public void dizaltı_çorap_kategorisini_seçilir() throws InterruptedException {
        firstCase_test.clickSocksBelowTheKnee();
    }

    @And("Filtrele butonuna basılır")
    public void filtrele_butonuna_basılır() {
        firstCase_test.clickFilterButton();
    }

    @And("Renklerden Siyah Rengi seçilir")
    public void renklerden_siyah_rengi_seçilir() throws Exception {
        firstCase_test.clickBlackButton();
    }

    @And("İçinde Siyah geçen bir ürünü seçilir")
    public void içinde_siyah_geçen_bir_ürünü_seçilir() throws InterruptedException {
        firstCase_test.clickBlackSock();
    }

    @Then("ürünün siyah olduğunu doğrulanır")
    public void ürünün_siyah_olduğunu_doğrulanır() {
        firstCase_test.checkBlack();
    }

    @And("Sepete Ekle butonuna basılır")
    public void sepete_ekle_butonuna_basılır() {
        firstCase_test.clickBasket();
    }

    @And("Sepeti Görüntüle butonuna basılır")
    public void sepetiGörüntüleButonunaBasılır() {
        firstCase_test.showBasket();
    }

    @And("Sepeti Onayla butonuna basılır")
    public void sepeti_onayla_butonuna_basılır() {
        firstCase_test.acceptBasket();
    }

    @And("Üye olmadan devam et butonuna basılır")
    public void üye_olmadan_devam_et_butonuna_basılır() {
        firstCase_test.nextWithoutBeMember();
    }

    @And("Mail adresi yazılır")
    public void mail_adresini_yazılır() {
        firstCase_test.typeEmail();
    }

    @And("KVKK kabul edilir")
    public void kvkkKabulEdilir() {
        firstCase_test.clickKVKK();
    }

    @And("Gönder butonuna basılır")
    public void devam_et_butonuna_basılır() {
        firstCase_test.send();
    }

    @And("Çerezler Kabul Edilir")
    public void çerezlerKabulEdilir() {
        firstCase_test.clickAcceptCookie();
    }

    @And("Yeni Adres Oluştur linkine basılır")
    public void yeni_adres_oluştur_linkine_basılır() {
        firstCase_test.createAddress();
    }


    @And("{string} adres başlığı yazılır.")
    public void adresBaşlığıYazılır(String addressTitle) {
        firstCase_test.typeAddressTitle(addressTitle);
    }

    @And("{string} isim yazılır.")
    public void isimYazılır(String firstName) {
        firstCase_test.typeFirstName(firstName);
    }

    @And("{string} soyadı yazılır")
    public void soyadıYazılır(String lastName) {
        firstCase_test.typeLastName(lastName);
    }

    @And("{long} cep telefonu yazılır.")
    public void ceptelefonuCepTelefonuYazılır(long cepTelefonu) {
        firstCase_test.typePhoneNumber(cepTelefonu);
    }

    @And("{string} adres yazılır.")
    public void adresYazılır(String address) {
        firstCase_test.typeAddress(address);
    }

    @And("{string} şehir seçilir")
    public void şehirSeçilir(String city) {
        firstCase_test.selectCity(city);
    }

    @And("{string} ilçe seçilir")
    public void ilçeSeçilir(String town) throws InterruptedException {
        firstCase_test.selectTown(town);
    }

    @And("{string} mahalle seçilir")
    public void mahalleSeçilir(String neighbourhood) throws InterruptedException {
        firstCase_test.selectNeighbourhoodelemnt(neighbourhood);
    }

    @And("Kaydet butonuna basılır.")
    public void kaydet_butonuna_basılır() {
        firstCase_test.clickSaveButton();
    }

    @And("Kargo firması seçilir")
    public void kargoFirmasıSeçilir() {
        firstCase_test.clickCargoCompany();
    }

    @And("Kaydet ve Devam Et butonuna basılır.")
    public void kaydet_ve_devam_et_butonuna_basılır() {
        firstCase_test.clickSaveAndContinue();
    }

    @And("Siparişi Tamamla butonuna basılır")
    public void siparişi_tamamla_butonuna_basılır() {
        firstCase_test.clickCompleteOrder();
    }

    @Then("{string} mesajının geldiği görülür")
    public void mesajının_geldiği_görülür(String message) {
        firstCase_test.assertMyMessage(message);
    }

}
