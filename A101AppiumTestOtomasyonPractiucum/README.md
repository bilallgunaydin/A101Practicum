
# A101 Mobil App Practicum

A101 mobil uygulamasındauçtan uca ödeme testi yapılmıştır. Uygulamanın ilk açılışından ödeme ekranına kadar Appium framework üzerinden uygulama elementleri bulunup, java proglama dili ile kullanarak Vysor programı ile gerçek bir cihaz üzerinden testler yapılarak otomasyon projesi yapılmıştır. 
Ödeme ekranı doldurulmamıştır. 


![a101-logo-768x699 (1)](https://user-images.githubusercontent.com/21973124/193421439-965b6bb0-bd51-403b-a0dd-6450dd2b18c5.png)

    
## Kullanılan Teknolojiler


**Java:** Projenin yazılmış olduğu programlama dilidir

**TestNG:** Test Caselerin yazılması ve çıktıların kontrollerinde kullanılan Test Yazım Aracıdır

**Selenium:** Web Sitesini test etmek için kullanılan Test Otomasyon Aracıdır

**Page Object Model:** Projede kullanılan mimari yapıdır

**Maven:** Genellikle Java platformunda yer alan komutların derlenmesi sırasında kullanılan otomasyon ve inşa aracıdır

**Cucumber:**Cucumber, BDD (Behavior Driven Developmet) destekli bir test otomasyon yaklaşımıdır

**Gherkin:** Gherkin bir plain-text language’dir. Yazılımcı olmayan kişiler tarafından öğrenilebilecek şekilde tasarlanmıştır

**Appium**: Bir web sürücüsü kullanarak Android veya iOS'ta komut dosyalarını çalıştırmak ve yerel uygulamaları, mobil web uygulamalarını ve hibrit uygulamaları test etmek için açık kaynaklı bir otomasyon aracıdır.

**Vysor**: Android işletim sistemine sahip cep telefonunuzu işletim sisteminiz üzerinden kontrol etmeye yarayan uygulamadır. 


## Uygulama İçin Kullanılan Teknolojilerin Sürümleri ve Mobil Cihazın Özellikleri

**Appium**: windows-1.21.0-1

**Android Studio**: 3-4-1-64 Bit

**Telefon Modeli ve Markası**: Redmi Note 9

**Cihazın İşletim Sistemi**: Android

**Cihazın İşletim Sisteminin Sürümü**: 11.0

**appPackage**: org.studionord.a101

**appActivity**: org.studionord.a101.MainActivity

**Cucumber**: 7.6.0

**Selenium-Java**: 4.4.0

**Testng-Test**: 7.6.0

**Testng-Compile**: 7.6.0

**Jdk**: 1.8.0_341

**Vysor**: 4.1.77

## Case Aşamaları

**Scenario Outline:**  Kadın Dizaltı Siyah Çorap Satın Alınması
    
    -And Güncelleme Kontrol Edilir
    -And Menuye basılır.
    -And Giyim-Aksesuar butonuna tıklanır
    -And Kadın İç Giyim kategorisine tıklanır
    -And Dizaltı Çorap Kategorisini Seçilir
    -And Filtrele butonuna basılır
    -And Renklerden Siyah Rengi seçilir
    -And İçinde Siyah geçen bir ürünü seçilir
    -Then ürünün siyah olduğunu doğrulanır
    -And Sepete Ekle butonuna basılır
    -And Sepeti Görüntüle butonuna basılır
    -And Sepeti Onayla butonuna basılır
    -And Üye olmadan devam et butonuna basılır
    -And Mail adresi yazılır
    -And KVKK kabul edilir
    -And Gönder butonuna basılır
    -And Çerezler Kabul Edilir
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
    -Then "Kart ile ödeme" mesajının geldiği görülür
  
## Kullanım/Örnekler


 Examples:
      
      | adresBasligi | ad    | soyad  | cepTelefonu | adres             | il       | ilce   | mahalle        |
      | ev           | Ahmet | Toprak | 5555555555  | Güneş sokak 65555 | İSTANBUL | ADALAR | HEYBELİADA MAH |

  
## Demo

https://www.youtube.com/watch?v=QxW-QlWV8JQ&ab_channel=BilalG%C3%BCnayd%C4%B1n

  
## Ekran Görüntüleri

![Uygulama Ekran Görüntüsü]
![A101 Appium](https://user-images.githubusercontent.com/21973124/193424424-07aa849f-4d48-48b3-beeb-b09c06bc0d43.jpg)
![A101 appium 2](https://user-images.githubusercontent.com/21973124/193424461-a9f2763c-cae3-4014-9616-58963e644205.jpg)




  
## Çıkarılan Dersler

Önceki A101 Web Practicum projesinde Selenium, Cucumber gibi teknolojileri deneyimleme fırsatı bulmuştum. Bu sefer Appium ile karşılaştım. Bu gerçekten bir karşılaşmaydı. Zorlu bir rakipti. A101 uygulamasından mıdır bilemiyorum ama bir türlü Appium kullanarak Android Emülatör üzerinden A101 uygulamasını açamadım. Onlarca video izledim. Birçok makale okudum. Birkaç tane android studio versiyonu denedim. Birçok emülatör ve android işletim sistemi modeli denememe rağmen hiçbir çözüm bulamadım. Ben de kendi cihazımda test yapmaya karar verdim. Vysor uygulaması sayesinde telefonumun ekranını bilgisayarda yönetmeyi başardım. Sonra telefon modelimi, A101 uygulama bilgilerini vs İntellij üzerinden Capitilites olarak ekledim. Bu şekilde testlerimi gerçekeştirecek ortamı oluşturmuş oldum. 
En çok zorlandığım kısım mobil uygulamada test yapmaktı. Çünkü hiç bilmediğim bir alandı ve ilk başta deyim yerindeyse kaplumbağa gibi ilerledim. Sonra çözünce birden hızlandım ve süreci tamamladım. Çok fazla yeni araç ve appium elementi ile tanıştım. Onları kodlamayı öğrendim. İlk defa bir E - ticaret sitesinin mobil uygulamasını test etme fırsatı bulduğum için çok fazla hata ile karşılaşıp çok fazla şey öğrendim.



  
## Geri Bildirim

Projeyle ilgili herhangi bir geri bildiriminiz varsa, lütfen bilallgunaydin@gmail.com adresinden bana ulaşın.

  
