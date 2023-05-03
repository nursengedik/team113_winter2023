package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();// altını çizince alt+shift+enter import edilir

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [A, B, K]

        //Element silme işlemi remove ile yapılır
                                                     //methodu doğru okumak önemlidir
        System.out.println(harfler.remove("B")); // true -silmesi için obje verilince booleon sonuç döndürür
                                                   //yani sildim veya silemedim, silinmiş durumu göstermez
                                                  //görmek için yazdırmalıyız, remove'nin görevi silmektir
                                                //bazen yapılan işten hariç döndürdüğü sonuç da önemlidir
        System.out.println(harfler); // [A, K]

        System.out.println(harfler.remove(0)); // A - index verirsek 0 index'teki elementi döndürür
                                                    //silinecek elementi yazdırır
        System.out.println(harfler); // [K]        //silinmiş halini görmek için yadırmalıyız


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar); // [1, 3, 18, 2]
        /*
            remove methoduna obje vermek farklı index vermek farklıdır.
            Eger sayilardan olusan bir list varsa
            remove method'una yazacagimiz sayiyi index olarak kabul eder
            Eger sayiyi silmek isterseniz
            remove method'undan once o sayiyi bir objeye atayip
            remove method'unda obje ismini yazabiliriz
         */
        sayilar.remove(1);//1. index'teki elementi siler, yani 3 ü siler
        System.out.println(sayilar); // [1, 18, 2]

        // 1'i silelim - yani elementi silelim

        Integer silinecekSayi = 1;   //varsayalım ki 1 in index'ini bilmiyorum
                                    // 1 i Integer den oluşan objeye atarız

        sayilar.remove(silinecekSayi); //silinecek sayı variable olarak yazılır

        System.out.println(sayilar); // [18, 2]


    }
}
