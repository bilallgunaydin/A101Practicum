
# A101 Web Practicum

https://www.a101.com.tr/ A101 alışveriş web sitesinde Uçtan uca ödeme testi yapılmıştır. Siteye ilk girişten ödeme ekranına kadar Selenium framework kullanılarak, java proglama dili ile chrome browser kullanarak test otomasyon projesi yapılmıştır. 
Ödeme ekranı doldurulmamıştır. 


![a101-logo-768x699 (1)](https://user-images.githubusercontent.com/21973124/193421439-965b6bb0-bd51-403b-a0dd-6450dd2b18c5.png)


    
## Kullanılan Teknolojiler

**İstemci:** React, Redux, TailwindCSS

**Sunucu:** Node, Express

**Java:** (Projenin yazılmış olduğu kodlama dilidir)

**TestNG:**(Test Caselerin yazılması ve çıktıların kontrollerinde kullanılan Test Yazım Aracıdır)

**Selenium:** (Web Sitesini test etmek için kullanılan Test Otomasyon Aracıdır)

**Page Object Model:** (Projede kullanılan mimari yapıdır)

**Maven:** (Genellikle Java platformunda yer alan komutların derlenmesi sırasında kullanılan otomasyon ve inşa aracıdır)

**Cucumber:**(Cucumber, BDD (Behavior Driven Developmet) destekli bir test otomasyon yaklaşımıdır)

**Gherkin:** (Gherkin bir plain-text language’dir. Yazılımcı olmayan kişiler tarafından öğrenilebilecek şekilde tasarlanmıştır)
## Uygulama İçin Kullanılan Teknolojilerin Sürümleri

**Chrome Driver**: 106.0.5249.61

**Cucumber**: 7.6.0

**Selenium-Java**: 4.4.0

**Testng-Test**: 7.6.0

**Testng-Compile**: 7.6.0

**Jdk**: 18.0.2.1
## Case Aşamaları

**Scenario Outline:**  Kadın Dizaltı Siyah Çorap Satın Alınması
    
    -Given Web sitesine gidilir
    -And Cerezleri kabul edilir
    -And Giyim-Aksesuar butonuna tıklanır
    -And Kadın İç Giyim kategorisine tıklanır
    -And Dizaltı Çorap Kategorisini Seçilir
    -And Renklerden Siyah Rengi seçilir
    -And İçinde Siyah geçen bir ürünü seçilir
    -Then ürünün siyah olduğunu doğrulanır
    -And Sepete Ekle butonuna basılır
    -And Sepeti Görüntüle butonuna basılır
    -And Sepeti Onayla butonuna basılır
    -And Üye olmadan devam et butonuna basılır
    -And Mail adresi yazılır
    -And Devam Et butonuna basılır
    -And Yeni Adres Oluştur linkine basılır
    -And "<adresBasligi>" adres başlığı yazılır.
    -And "<ad>" isim yazılır.
    -And "<soyad>" soyadı yazılır
    -And <cepTelefonu> cep telefonu yazılır.
    -And "<adres>" adres yazılır.
    -And "<il>" şehir seçilir
    -And "<ilce>" ilçe seçilir
    -And "<mahalle>" mahalle seçilir
    -And Kaydet butonuna basılır.
    -And Kargo firması seçilir
    -And Kaydet ve Devam Et butonuna basılır.
    -And Siparişi Tamamla butonuna basılır
    -Then "Kart ile ödeme" mesajının geldiği görülür.

  
## Kullanım/Örnekler


 Examples:
      
      | adresBasligi | ad    | soyad  | cepTelefonu | adres             | il       | ilce   | mahalle        |
      | ev           | Ahmet | Toprak | 5555555555  | Güneş sokak 65555 | İSTANBUL | ADALAR | HEYBELİADA MAH |

  
## Demo

https://www.youtube.com/watch?v=x7J4OsdO-Ac&ab_channel=BilalG%C3%BCnayd%C4%B1n

  
## Ekran Görüntüleri

![A101 ScreenShot Feature](https://user-images.githubusercontent.com/21973124/193421501-a68ce223-ad99-4be9-be4b-76fb230d394a.jpg)


  
## Çıkarılan Dersler

Bu projede selenium, cucumber gibi teknolojileri deneyimleme fırsatı buldum. En çok zorlandığım kısım ise sipariş edilen ürün için kargo firması seçmekti. Web sitesinin algoritmasına göre seçilen il, ilçe, mahalleye göre kargo seçimleri otomatik olarak karşınıza geliyor ve bence saate göre 1 veya 1'den fazla seçenek geliyor. 1 seçenek varsa zaten otomatik seçili geliyor. Eğer xpath kullanırsam 2 seçenek geldiğinde xpath değiştiği için patlıyordu. Ben de class olarak elementi seçip bir list olarak onu karşıladım ve her seferinde ilk elementi seçip, tıklattım. Bu şekilde bu sorunu çözmüş oldum. İlk defa bir e - ticaret sitesini test etme fırsatı bulduğum için çok fazla hata ile karşılaşıp çok fazla şey öğrendim. 

  
## Geri Bildirim

Projeyle ilgili herhangi bir geri bildiriminiz varsa, lütfen bilallgunaydin@gmail.com adresinden bana ulaşın.

  
