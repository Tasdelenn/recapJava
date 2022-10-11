* Bu package daha sonra Spring Framework kulanılarak daha iyi hale getirilecek.
* Burada klasik, monolit N Layered App örneği yyapılacak.
* Çoğu kurumsal yapıda %90 bu yapı kullanılıyo. Firmalar sorun yaşamadıkça kod yapısını kolay kolay değiştirmiyo.

Kod bloğumuzu üçe ayırabiliriz:
1. `Data Access` işini yapan kısım << (JDBC, Hibernate-ORM, JPA implemantasyonları = Veritabanına erişim yöntemleri) 
2. `Business Kısmı` : İş geliştirmeyle alakalı kısım. (Mesela alışveriş sitesinde (veya youtube 'da) kişiye özel veri sunumu gibi...)
3. `UI` : Son kullanıcıyı karşılayan kısım. (Mesela web uygulamasından aldığın ürünü hem cep telefonundan, hem bilgisayardan (IOS, Android, Windows, Linux, MacOS...) gördüğümüz arayüz le ilgilenen kısım.

Bloğu bu şekilde parçaladığımız zaman daha kolay yönetilir, sürdürülebilirlik artar. Bi nevi logo haline gelir.

* `Entities` de bizim veritabanı nesnelerimiz olacak.

DAL > Data Accsess Layer
DAO > Data Accsess Object
PDO > php Data Object 
Bu gibi isimler sık kullanılır.

---

HibernateProductDao ve JDBCProductDao gibi birbirinin alternatifi olan durumlarda
(Veya CorporateCustomer ve IndivdualCustomer vs gibi) bunlara INTERFACE yapılır...

Bundan sonra, 
Interface oluştururum,
JDBCDao yu açarım, implemente ederim, kodlarımı doldururum...
HibernateDao yu açarım, implemente ederim, kodlarımı doldururum...
Böylece JdbcProductDao ve HibernateProductDao'ya "Sen IProductDao'nın kurallarına UYACAKSINIZ!" demiş oluyoruz.

Fakat buna rağmen bir problem var. Yine de new lenen tüm yerler değişecek...
**KURAL**: (Business, DataAccess, API, Arayüz vs için olmak üzere... Entities özellik sınıfı olduğu için bu hariç)
Bir katman başka bir katmanın class ını  kullanıyorken, Sadece Interface üzerinden erişim sağlamalıdır.

