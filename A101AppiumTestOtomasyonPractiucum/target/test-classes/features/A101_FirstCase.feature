Feature: Uçtan Uca Ödeme Test

  @Cart
  Scenario Outline:  Kadın Dizaltı Siyah Çorap Satın Alınması
    And Güncelleme Kontrol Edilir
    And Menuye basılır.
    And Giyim-Aksesuar butonuna tıklanır
    And Kadın İç Giyim kategorisine tıklanır
    And Dizaltı Çorap Kategorisini Seçilir
    And Filtrele butonuna basılır
    And Renklerden Siyah Rengi seçilir
    And İçinde Siyah geçen bir ürünü seçilir
    Then ürünün siyah olduğunu doğrulanır
    And Sepete Ekle butonuna basılır
    And Sepeti Görüntüle butonuna basılır
    And Sepeti Onayla butonuna basılır
    And Üye olmadan devam et butonuna basılır
    And Mail adresi yazılır
    And KVKK kabul edilir
    And Gönder butonuna basılır
    And Çerezler Kabul Edilir
    And Yeni Adres Oluştur linkine basılır
    And "<adresBasligi>" adres başlığı yazılır.
    And "<ad>" isim yazılır.
    And "<soyad>" soyadı yazılır
    And <cepTelefonu> cep telefonu yazılır.
    And "<adres>" adres yazılır.
    And "<il>" şehir seçilir
    And "<ilce>" ilçe seçilir
    And "<mahalle>" mahalle seçilir
    And Kaydet butonuna basılır.
    And Kargo firması seçilir
    And Kaydet ve Devam Et butonuna basılır.
    And Siparişi Tamamla butonuna basılır
    Then "Kart ile ödeme" mesajının geldiği görülür



    Examples:
      | adresBasligi | ad    | soyad  | cepTelefonu | adres             | il       | ilce   | mahalle        |
      | ev           | Ahmet | Toprak | 5555555555  | Güneş sokak 65555 | İSTANBUL | ADALAR | HEYBELİADA MAH |