package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C05_HashMapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> ornekMap= new TreeMap<>();

        ornekMap.put("A",20);
        ornekMap.put("B",15);
        ornekMap.put("K",25);
        ornekMap.put("M",20);
        ornekMap.put("T",30);

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=20, T=30}



        System.out.println(ornekMap.get("K")); // 25 - get() bana bir key ver value sini döndüreyim demektir
        System.out.println(ornekMap.get("Z")); // null
        // Verilen Key varsa value'sunu dondurur, yoksa null dondurur

        System.out.println(ornekMap.getOrDefault("M", 60)); //20 - M varsa değerini yazdırır
        System.out.println(ornekMap.getOrDefault("Z", 60)); //60 - Z yoksa default olarak 60 yazdırır
        // verilen key varsa value'sunu getirir, yoksa verilen default degeri dondurur


        System.out.println(ornekMap.replace("M", 50)); // 20 - method eski değerini döndürüyor
        // Verilen key varsa, degerini update eder ve eski degeri dondurur

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=30} ama değerine 50 atıyor


        System.out.println(ornekMap.replace("T", 30, 90)); // true der ve değişikliği yapar
                                           //T nin değeri 30 yeni değeri olarak 90 yap demektir
        // Verilen key'in eski value'su verilen deger ise update edip true doner
        // key'in degeri verilen deger degilse bir islem yapmaz ve false dondurur

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90}

        System.out.println(ornekMap.replace("B", 30, 90)); // false B nin değeri 30 olmadığı
                                                                               //için false döner

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90}      //ve değişikliği yapmaz


    }
}