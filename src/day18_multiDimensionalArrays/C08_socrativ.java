package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C08_socrativ {

    public static void main(String[] args) {
        //Soru 1-

       // int arr[] = new int[5];

        //Yukaridaki kod ile ilgili asagidakilerden hangisi yanlistir? c

       // Integer data type'inda elemanlar iceren bir array olusturulmustur.
        //Bu array 5 eleman icerir.
        //System.out.println(arr[5]);
        //
        //Kodu ekrana 0 yazdirir.
        //Bu array'e eleman atamasi yapilmadigindan Java her eleman icin default
        //
        // deger atamasi yapar. Integerlar icin default deger 0 dir.

       //Soru 2-

        //short arr[] = new short[4];
//
        //arr[0] = 10;
//
        //arr[1] = 11;
//
        //arr[3] = 13;

        //Yukaridaki kod ile ilgili asagidakilerden hangileri dogrudur?// b c d

        //System.out.println(arr);//parametresini yazdırır

       // Kodu ekrana {10,11,13} yazdirir.

        //System.out.println(arr[2]);//0

        //b Kodu ekrana 0 yazdirir.

        //System.out.println(arr[1] + arr[3]);

       //c  Kodu ekrana 24 yazdirir.

        //int sum=0;
//
        //for(int i=0; i<arr.length; i++) {
//
        //    sum = sum + arr[i];
//
        //}
//
        //System.out.println(sum);

       // d  Kodu ekrana 34 yazdirir.

        //Soru 3-

        //char arr[] = new char[3];
//
        //arr[0] = 'A';
//
        //arr[1] = 'L';
//
        //arr[2] = 'I';
//
//
//
        //for(int i=2; i>0; i--) {
//
        //    System.out.print(arr[i]);// IL yazdırır
//
        //}

       // Kodu ekrana ne yazdirir?

        // a ALI                             //B ILA
        //  C IL                           // D AL      C doğru

       // soru 4-

        //short arr[] = new short[4];
//
        //arr[0] = 10; //burada index'lere atama yapılmış
//
        //arr[1] = 11;
//
        //arr[2] = 12;
//
        //arr[3] = 13;

        //Asagiadkilerden hangi ikisinin ekran ciktisi aynidir?

        //System.out.print(arr[4]);//hata
        //System.out.print(arr[3]);//13
       // System.out.print(arr[arr.length-1]);//13 uzunluğun bir eksiği index'indeki element
        //System.out.print(arr[arr.length+1]);//hata

        //soru 5-

       // int arr[] = {1, 2, 3.5, 4, 5};// bir arrays içinde farklı data türünden element olamaz.CTE verir
                                       //syntx hatası, altını kırmızı çizer,çalışmaz
        //Yukaridaki kod ile ilgili asagidakilerden hangisi dogrudur?

        //System.out.print(arr[1]);

       //a  Kodunun ekran ciktisi 2 dir.

        //System.out.print(arr[4]);

        //b Kodunun ekran ciktisi 5 dir.

        //c Compile Time Error verir.                   // cevap c
        //d Run Time Error verir

        //Soru 6


        //Asagidakilerden hangileri array'ler icin dogrudur?

         //Array'lere eleman olarak sadece primitive data turunden degerler veya non-primitive'lerin reference'lari konabilir.
        //Bir array'deki tum elemanlarin data type'lari ayni olmalidir.
        //Bir array'e eleman atamasi yapilmazsa, Java her elemanin yerine default degerler atar.
        //Array olusturup eleman atamasi yapma iki farkli yontemle yapilabilir.  hepsi doğru

        //Soru 7-

        //int arr[] = {11, 12, 13, 14};

        //Yukarida verilen array ile ilgili asagidakilerden hangisi yanlistir?

        //System.out.println(Arrays.toString(arr));//tüm arrays'ı yazdırır

        //Ekrana [11, 12, 13, 14] yazdirir. doğru

        //System.out.println(arr[arr.length-2]);//arrays'in uzunluğunun -2 ci index'indeki elemanı yazdırır

        //Ekrana 13 yazdirir. doğru

       // System.out.println(arr[1]);//arr'nin 1. index'indeki elementi yazdırır

        //Ekrana 11 yazdirir. yanlış, 12 yazdırır

        //for(int i=0; i<4; i++) {
//
        //    System.out.print(arr[i] + " ");
//
        //}

        //Ekrana 11 12 13 14 yazdirir. doğru

        // soru 8-

       //int arr[] = {2, 11, 0, 23, 7};

       //Arrays.sort(arr);//küçükten büyüğe doğru sıralama yapar [0, 2, 7, 11, 23]

       //for(int i=4; i>=0; i--) {//ama burada sıralamayı tersine çevirir büyükten küçüğe doğru elemanları yazdırır
       //                         //yani parantezsiz yazdırır, köşeli parantez içinde yazdırmaz
       //    System.out.print(arr[i] + " ");//23 11 7 2 0 -

       //}

       // Yukarida verilen kodun ekran ciktisi nedir?

        //0 2 7 11 23
        //23 11 7 2    doğru
        //[23, 11, 7, 2, 0]
        //Compile Time Error verir

        //soru 9-

       // int arr[] = {1, 23, 12, 2, 3};

        //Yukarida verilen array'de 12'nin eleman olarak var olup olmadigini kontrol etmek icin
        // asagidaki kodlardan hangisi yazilmalidir?

        //System.out.println(Arrays.binarySearch(arr, 12));//ekranda 2 yazdırır doğru ama her zaman bu yöntem
                                                           //doğru olmayabilir,önce sıralama yapılmalı   a

       //Arrays.sort(arr);// b

       //System.out.println(Arrays.binarySearch(12));//hata verir, parantezde arrays'i belirtilmedi

       // System.out.println(Arrays.binarySearch(12)); // c- hata verir
        //Arrays.sort(arr);//[1, 2, 3, 12, 23]
//
        //System.out.println(Arrays.binarySearch(arr, 12));//3 index'ini döndürür- doğru

        //soru 10-


        //int arr[] = {12, 23, 12, 2, 3};
//
        //Arrays.sort(arr);//sıralama yapar [2, 3, 12, 12, 23]
//
        //System.out.println(Arrays.binarySearch(arr, 5));//arr arrays'inde 5 elemanı var mıdır sorar
                                                            //eğer olsaydı arr'ye göre kaçıncı index te olurdu
                                                           //onu - eksi haliyle yazdırır, -2 yazdırması gerekir
                                                          //ama -3 yazdırıyor

        //Ekran ciktisi nedir?// cevap -3 olacak

        //soru 11-

        int arr[] = {3, 2, 3, 4, 4, 5,};

        int count = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i]==3) {

                count++;

            }

        }

        System.out.println(count);

       // Ekran ciktisi nedir?//2











    }
}
