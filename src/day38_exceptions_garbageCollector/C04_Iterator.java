package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {

        /*
            java'da Colections konusunda ogrenecegimiz Set gibi bazi yapilar index desteklemez (kullanmaz)

            Bu durumda index olmadigindan elementleri yazdirmak istersek
            for-each loop kullanabiliriz

            Ama elementler arasinda dolasmak, belirli sartlari saglayanlari
            update etmek isterseniz, for-each loop ile yapamazsiniz.

            Hatta list'de istenmeyen elementleri silmek istedigimizde
            her sildigimiz element uzunlugu degistirdigi icin
            kodlar saglikli calismaz

            Bu sorunlari cozmek icin Java Iterator interface'ini olusturmustur.
         */

        List<Integer> sayilar = new ArrayList<>();//array in elementleri silinemez, list silinir
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        for (int i = 0; i < sayilar.size() ; i++) {//List 5 12 1 4 7 olduğunda ekranda [5, 1, 7] yazdırır
                                                  //List 6 12 14 4 72 olduğunda [12, 4] yazdırır birini silip diğerini
                                                 // yazdırmış çünkü bir önceki listte element silindiği için uzunluk
            if(sayilar.get(i)%2==0){            // değişti indexler değişir
                sayilar.remove(i);
            }
        }

        System.out.println(sayilar);
    }
}