# static
* Bir nesneyi static tanımladığın zaman, o program sonlanana kadar hafızadan atılmaz. 
* New lenen bir referans nesnesinin referansı boşaldığı zaman garbage collector bunu ortadan kaldırır.
* Ancak static şu anlama gelir: Sistemde ilk kullanmayla oluşur; daha sonra gelen bütün kullanıcılar bunu kullanır.
* Oyüzden static nesnelere "sen bi tanesin" diyebiliriz... Garbage collector tarafından kaullanılmadığı zaman dahi temizlenemez...
* Bir metodu `static` yaptığında direkt sınıf ismiyle çağrılabilir... Ve çağrıldığı anda da bellekte oluşur.
* Yani static metodu kullanmak için nesne oluşturmak (new lemek) gerekmez...
* Kullan bırak operasyonlar için uygundur.