package Day41_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
        List data türünde bir linkedlist oluşturalım
         */
        List<String> harfler=new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");

        System.out.println(harfler); //[H, K, M, L]
        harfler.add("B");
        System.out.println(harfler);//[H, K, M, L, B]

        //3.index'e eleman ekleyelim
        harfler.add(3,"T");
        System.out.println(harfler);//[H, K, M, T, L, B]

        harfler.set(3,"R");
        System.out.println(harfler);//[H, K, M, R, L, B] - 3. index e eleman ekledik

        List<String> semboller=new LinkedList<>();

        semboller.add("*");
        semboller.add("B");
        semboller.add("%");
        semboller.add("&");

        System.out.println(semboller);//[*, B, %, &] - [H, K, M, R, L, B]
        System.out.println((harfler.retainAll(semboller)));//true - harfler içindeki sembollerle ortak olmayan
                                                          // elemanları  sil demektir
        System.out.println(semboller);//[*, B, %, &]
        System.out.println(harfler);//[B] - ortak olan B elemanı haricindekileri siler
        harfler.addAll(semboller);//sembollerin tamamını harfler e ekledik  - [B, *, B, %, &]

        System.out.println(harfler);//harfler --> [B, *, B, %, &]   semboller -->[*, B, %, &]
        System.out.println(harfler.removeAll(semboller)); //true-harflerin içerisindekitüm sembolleri sil demektir
        System.out.println(harfler);//[]                 //sembollerde B olduğu için 2 B yi de siler


    }
}
