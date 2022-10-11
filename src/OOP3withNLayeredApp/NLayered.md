* Bu package daha sonra Spring Framework kulanılarak daha iyi hale getirilecek.
* Burada klasik, monolit N Layered App örneği yyapılacak.
* Çoğu kurumsal yapıda %90 bu yapı kullanılıyo. Firmalar sorun yaşamadıkça kod yapısını kolay kolay değiştirmiyo.

Kod bloğumuzu üçe ayırabiliriz:
1. `Data Access` işini yapan kısım << (JDBC, Hibernate-ORM, JPA implemantasyonları) 
2. `Business Kısmı` : İş geliştirmeyle alakalı kısım. (Mesela alışveriş sitesinde (veya youtube 'da) kişiye özel veri sunumu gibi...)
3. `UI` : Son kullanıcıyı karşılayan kısım. (Mesela web uygulamasından aldığın ürünü hem cep telefonundan, hem bilgisayardan (IOS, Android, Windows, Linux, MacOS...) gördüğümüz arayüz le ilgilenen kısım.

Bloğu bu şekilde parçaladığımız zaman daha kolay yönetilir, sürdürülebilirlik artar. Bi nevi logo haline gelir.

* `Entities` de bizim veritabanı nesnelerimiz olacak.