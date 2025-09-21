# Workintech Burger

Bu proje, **Workintech Burger** adlı bir şirketin hamburger satış sürecini yönetmek için hazırlanmıştır. Java ile OOP kavramlarını kullanarak hamburger, sağlıklı hamburger ve deluxe burger sınıfları tasarlanmıştır.

## Özellikler

### Hamburger Sınıfı
- `name`, `meat`, `price`, `breadRollType` değişkenlerini içerir.
- Maksimum 4 ek malzeme eklenebilir (`Addition1-4`).
- Eklenen malzemelerin isim ve fiyat bilgileri tutulur.
- `itemizeHamburger()` ile tüm malzemeler ve toplam fiyat ekrana basılır.

### HealthyBurger Sınıfı
- `Hamburger` sınıfından türetilmiştir.
- `meat` değeri sabit olarak `Tofu`'dur.
- İki ekstra sağlıklı malzeme eklenebilir (`HealthyAddition1-2`).
- `itemizeHamburger()` hem normal hem sağlıklı eklemeleri ve toplam fiyatı gösterir.

### DeluxeBurger Sınıfı
- `Hamburger` sınıfından türetilmiştir.
- Otomatik olarak `chips` ve `drink` eklenir.
- Ek malzeme eklenemez, ekleme denemelerinde uyarı verir.
- Fiyatı ve içeriği default olarak ayarlanmıştır.

## Kullanım

Örnek kullanım:

```java
Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, "Wrap");
hamburger.addHamburgerAddition1("Tomato", 0.27);
hamburger.itemizeHamburger();

HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");
healthyBurger.addHealthyAddition1("Lentils", 3.41);
healthyBurger.itemizeHamburger();

DeluxeBurger db = new DeluxeBurger();
db.addHamburgerAddition3("Should not do this", 50.53); // Uyarı verir
db.itemizeHamburger();
