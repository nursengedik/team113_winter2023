package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(61);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // tum elementleri index kullanmadan 3 artirin


        ListIterator lit = sayilar.listIterator();//ListIterator daha çok kullanılır, çünkü daha çok methodu var

        while (lit.hasNext()) {//hasNext () yanında eleman olduğu müddetçe demektir

            Integer sayi = (Integer) lit.next();//next () bir sağa gider ve oradaki lit'deki sayıyı alıyoruz

            lit.set(sayi + 3);//sayıyı 3 artırıp günceller
        }

        System.out.println(sayilar);
    }
}