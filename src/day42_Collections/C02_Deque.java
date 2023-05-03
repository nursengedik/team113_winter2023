package day42_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        // Deque Double ended queue
        //çift taraflı kuyruk


        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("K");
        System.out.println(harfler);//[J, K]

        harfler.addFirst("B"); //[B, J, K] - bşına ekleme yapar
        System.out.println(harfler);

        System.out.println(harfler.remove()); // B - ilk elemanı siler ve sildiği elemanı yazdırır
        System.out.println(harfler);

        harfler.addFirst("T"); // T,J,K  başına ekler
        harfler.addLast("T");//T,J,K,T   sonuna ekler
        harfler.add("L");//T,J,K,T,L
        System.out.println(harfler);
        System.out.println(harfler.removeLastOccurrence("T"));//true - son gördüğünü sil
        System.out.println(harfler);//[T, J, K, L]
        System.out.println(harfler.removeFirstOccurrence("R"));//false - ilk gördüğünü sil, yok ise hata verir
        System.out.println(harfler);

        System.out.println(harfler.peekFirst());//ilk elemanı yazdırır kaldırmadan
        System.out.println(harfler.peekLast());//son elemanı yazdırır kaldırmadan
        System.out.println(harfler.hashCode());

        LinkedList<String> karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("?");
        System.out.println(karakterler);
        karakterler.push("&");//ilk elemanı sağa iter ve yerine girilen değeri yazdırır
        System.out.println(karakterler);

        LinkedList<String> copy= (LinkedList<String>) karakterler.clone();
        System.out.println(copy);
    }
}

