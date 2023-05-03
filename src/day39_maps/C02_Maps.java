package day39_maps;

import java.util.Map;

public class C02_Maps {

    public static void main(String[] args) {

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        //eşitliğin sağ tarafı (başka clastan kullandığımız method) map deposundaki map i alır getitirir ve biz sadece
        //bir defa kullanabiliriz, sürekli kullanacaksak (döndürecekse) kaydetmeliyiz

        okulMap.put(110,"Kerem-Umut-12-K-MF");//110 nu ekledik

        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106, 110]  key leri yazdırdık

        System.out.println(okulMap.values());//value leri yazdırdık

        // [Ali-Cem-10-H-MF,
        //  Veli-Can-10-M-TM,
        //  Ali-Can-11-M-Soz,
        //  Ayse-Cem-11-H-TM,
        //  Ayse-Han-10-H-MF,
        //  Veli-Han-10-H-MF,
        //  Kerem-Umut-12-K-MF]

        // Verilen sube'deki (sınıfa göre) ogrencilerin sinif, isim ve soyisimlerini
        // basta sira no olacak sekilde, her satirda bir ismin olacagi
        // bir liste seklinde yazdirin


        MapMethodDepo.subeOgrenciListesiYazdir(okulMap,"m");//okulMap teki sınıfa göre

    }
}
