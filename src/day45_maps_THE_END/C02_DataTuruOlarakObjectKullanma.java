package day45_maps_THE_END;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_DataTuruOlarakObjectKullanma {

    public static void main(String[] args) {

        List<Object> sayilar = new ArrayList<>();
        sayilar.add(4);

        sayilar.add('d');// Object yerine Integer yazmış olsaydıkbunların hiç birini kabul etmezdi
        sayilar.add("Java");
        sayilar.add(true);
        sayilar.add(4.2);

        int[] a ={3,4,5};
        sayilar.add(a);

        System.out.println(sayilar); // [4, d, Java, true, 4.2, [I@36d64342]

        //Object olunca her şeyi ekleyebiliyoruz ama list te eklediğimiz bir array i varsa referansını yazdırır
        //bu dururmda array in index ini bilmemiz gerekir
        //sayılar list inin 5. index inde bir array var ama 5. index in bir array olduğunu belirtmeliyiz
        //bunu da int[] belirtmemiz gerekir, sorumluluğu almamızı ister

        System.out.println(  Arrays.toString(  (int[]) sayilar.get(5)   )); // [3, 4, 5]


        System.out.println( 7 + 6.5); // 13.5

        System.out.println((Integer)sayilar.get(0) +(Double) sayilar.get(4)); // 8.2

    }


}

