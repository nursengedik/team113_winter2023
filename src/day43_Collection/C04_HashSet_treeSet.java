package day43_Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_HashSet_treeSet {

    public static void main(String[] args) {

        /*
        bir hashset ve bir treeSet oluşturalım
        bir loop ile içlerine 150000 eleman ekleyelim
        işlem sürelerini kıyaslayalım
        */

        Random rnd=new Random();//rastgele eleman eklemeyi random class ından yapabiliyoruz
        int sayi;

        Set<Integer> hashSet=new HashSet<>();//collection
        Set<Integer> treeSet=new TreeSet<>();

        Long hashStart=System.currentTimeMillis();//başlangıç süresi
        for (int i = 0; i < 150000; i++) {
            sayi=rnd.nextInt(1250000);

            hashSet.add(sayi);
        }
        Long hashFinish=System.currentTimeMillis();//bitiş süresi

        Long treeStart=System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayi= rnd.nextInt(1250000);
            treeSet.add(sayi);
        }

        Long treeFinish=System.currentTimeMillis();

        System.out.println("Hash İşlem Süresi: "+(hashFinish-hashStart));
        System.out.println("Tree İşlem Süresi: "+(treeFinish-treeStart));

        //hashSet daha hızlı

        /*
        hash işlem süresi+51
        tree işlem süresi+16807099045801680709904433
        */

    }

}