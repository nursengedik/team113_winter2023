package day18_multiDimensionalArrays;


import java.util.Arrays;

public class C02_StringSplitMethodu {

    public static void main(String[] args) {

        // StringSplit bir String'i istedigimiz parcalara ayirmak icin kullanilir

        String str= "Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?(space'leri sayar +1 diye düşünürüz)

        String[] kelimeler= str.split(" ");//space'sden bölünürse tam da kelimelerden bölünmüş olur
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can]

        System.out.println("kelime sayisi : " + kelimeler.length); //8


        // en uzun kelime kac harflidir ? (en uzun kelimenin karakter sayısı)
        int enUzunKelimeLength=kelimeler[0].length();

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength= kelimeler[i].length();
            }
        }

        System.out.println("En uzun kelimenin karakter sayisi : " + enUzunKelimeLength);// 7

        // bir string'i karakterlerine ayirmak istersek
        String[] karakterler = str.split("");//karakterlerine "" hiçlikle ayrılır

        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi : " + karakterler.length);//44-sitring'in de length'ini
                                                                                //alsak 44 verir



    }
}
