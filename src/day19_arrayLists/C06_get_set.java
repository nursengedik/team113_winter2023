package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        System.out.println(sayilar.get(0));// 3 (0'cı index'teki elementi döndürür)


        // son elementi yazdirin

        System.out.println(sayilar.get(sayilar.size() - 1)); // 2

        // 2 elementini 12 yapin

        System.out.println(sayilar.set(2, 12));// 2 güncelleme - 2. index'i 12 yapma


        // 5'i 7 yapalim

        System.out.println(sayilar.set(1, 7)); // 5 - 1. index'i 7 yapma

        System.out.println(sayilar); // [3, 7, 12]


    }
}