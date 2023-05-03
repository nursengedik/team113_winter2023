package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_Sınav {

    public static void main(String[] args) {

        //soru 1-Asagidakilerden hangisi doğrudur?

        // List<String> list = new ArrayList<>();// A doğru
//
        // list.add("Ali");
//
        // System.out.println(list);
//
        //// Ekran ciktisi [Ali] dir.

        //List<String> list = new ArrayList<>();

        //list.add("Ali");

        //list.add("Ayse");

        //System.out.println(list);

        ////Ekran ciktisi [Ali, Ayse] dir.//B doğru

        //List<String> list = new ArrayList<>();
//
        //list.add("Ali");
//
        //list.add(0, "Ayse");
//
        //System.out.println(list);

        // Ekran ciktisi [Ayse, Ali] dir. c doğru

        //List<String> list = new ArrayList<>();

        //list.add("Ali");

        //list.add("Ayse");

        //System.out.println(list.lenght);//list'in uzunluğu size() ile bulunur

        // Ekran ciktisi 2 dir. D yanlış

        //Soru 2-Asagidakilerden hangisi yanlistir?

        //List<Integer> list = new ArrayList<>();
//
        //System.out.println(list.isEmpty());

        // Ekran ciktisi true dur. A doğru

        //List<Integer> list = new ArrayList<>();

        //list.add(123);

        //System.out.println(list.contains("123"));

        //Ekran ciktisi true dur. B yanlış,   false olacak çift tırnak içinde sayı verilmiş, string olmuş

        //List<Integer> list = new ArrayList<>();
//
        //list.add(321);
//
        //list.add(123);
//
        //Collections.sort(list);//[123, 321]
//
//
        //System.out.println(list);

        // Ekran ciktisi [123, 321] dir. C doğru

        //List<Integer> list = new ArrayList<>();
//
        //list.add(321);
//
        //list.add(123);
//
        //list.clear();//List'teki tüm elementleri siler
//
        //System.out.println(list);

        //Ekran ciktisi [ ] dir. D doğru

        //Soru 3-

        //List<Integer> list = new ArrayList<>();

        //list.add(7);

        //list.add(8);

        //list.add(9);//[7, 8, 9]

        //list.remove(9);//List'te 9 index yok

        //System.out.println(list);

        //Yukaridaki kod ile ilgili asagidakilerden hangisi dogrudur?

        //A-Ekran ciktisi [7, 8] olur.
        //B-Run Time Error verir.             doğru
        //C-Ekran ciktisi [7, 8, 9] olur.
        //D-Ekran ciktisi [9] olur.

        //Soru 4-

        //List<String> list = new ArrayList<>() ;

        //list.add( "Ali" );

        //list.add( "Can" );

        //list.add( "Ayse" );//[Ali, Can, Ayşe]

        //list.add( 0, "Havva");// yazdırırsak sonuç [Havva, Ali, Can, Ayşe]

        // Son durumda indexi 2 olan eleman hangisidir?

        //A-Ali
        //B-Can   doğru
        //C-Ayse
        //D-Havva

        //Soru 5_

        //List<String> list = new ArrayList<>() ;

        //list.add( "Ali" );

        //list.add( "Can" );

        //list.add( "Ayse" );//[Ali, Can, Ayşe]

        //list.set( 1, "Havva");//element ekleme değildir, 1. index'i günceller yani değiştirir ve Havva yazdırır

        //System.out.println(list);//[Ali, Havva, Ayse]


        //Ekran ciktisi nedir?

        //A-[Ali, Can, Ayse, Havva]
        //B-[Ali, Havva, Can, Ayse]
        //C-[Ali, Havva, Ayse]        doğru
        //D-[Ali, Ayse]

        //Soru 6-

        //List<String> list1 = new ArrayList<>();

        //List<String> list2 = new ArrayList<>();

        //List<String> list3 = new ArrayList<>();//[Beyhan, Ayhan]

        //list3.add("Ayhan");//[Ayhan]

        //list3.add(0,"Beyhan");//[Beyhan, Ayhan]

        //List<String> list4 = new ArrayList<>();////[Ayhan, Beyhan]

        //list4.add("Ayhan");

        //list4.add("Beyhan");

        //Asagidakilerden hangisi yanlistir?

        //System.out.println(list1.equals(list2));// A- doğru çünkü ikisi de boş list dir
        //Ekrana true yazdirir.

        //System.out.println(list1.equals(list3));//B doğru ikisi eşit değildir, false yazdırır
        //Ekrana false yazdirir.

        // System.out.println(list3.equals(list4));//C doğru eşit değillerdir false yazdırır
        // Ekrana false yazdirir.

        //System.out.println(list4.equals(list3));//D yanlış, eşit değillerdir false yazdırır

        // Ekrana true yazdirir.


        //Soru 7-

        //public static void main(String[] args) {

        //ArrayList<String> list = new ArrayList<String>();
//
        //list.add("A");
//
        //list.add("B");
//
        //list.add("C");
//
        //list.add("D");
//
//
//
        //System.out.println(list.remove(2));//2. index'teki sileceği elementi siler ve
        //                                        // sileceği elementi yazdırır-C
//
        //System.out.println(list.remove("C"));//C yi siler ama göstermez,sonucu boolean döndürür
        //bir üst satırda C yi sildiği için false döndürür


        // Output nedir?

        //A-C        doğru
        //  false

        //B-false
        //  C

        //C-true
        //  false

        //D-C
        //  C

        //Soru 8-

        //Note: get() method index'i verilen elemani return eder.

        //public static void main(String[] args) {
//
        // ArrayList<String> list = new ArrayList<String>();
//
        // list.add("A");
//
        // list.add("B");
//
        // list.add("C");
//
        // list.add("D");
//
        // for (int i = 0; i < list.size(); i++) {
//
        //     System.out.print(list.get(i) + " ");//A-A B C D
//
        // }


        // Ekran ciktisi ne olur ?

        //A-A B C D         DOĞRU
        //B-[A, B, C, D]
        //C-Run Time Error
        //D-Compile Time Error

        //Soru 9-


        //public static void main(String[] args) {

           // int arr[] = new int[5];
//
           // ArrayList<Integer> list = new ArrayList<Integer>();
//
//
//
           // for (int i = 1; i <= arr.length; i++) {
//
           //     list.add(i);
//
           // }
//
           // System.out.println(list);

       // }

        //Output nedir?

        //A-[0, 0, 0, 0, 0]
        //B-[1, 2, 3, 4, 5]  doğru
        //C-[ ]
        //D-Compile Time Error

        //Soru 10-

       // public static void main(String[] args) {

           //ArrayList<Character> list = new ArrayList<Character>();



           //for (char i = 'a'; i <= 'e' ; i++) {

           //    list.clear();//i yi siler

           //    list.add(i);//burada boş list'te a yı ekler, sonra siler ve en son e yi yazdırır

           //}

           //System.out.println(list);//[e]

        //}

       // Output nedir?

        //A-[ ]
        //B-[ e ]            DOĞRU
        //C-[a, b, c, d, e]
        //D-Compile Time Error










    }
}








