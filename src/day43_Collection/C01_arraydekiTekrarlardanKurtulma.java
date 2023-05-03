package day43_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_arraydekiTekrarlardanKurtulma {

    public static void main(String[] args) {

          /*
        Soru:
        Verilen bir arraydeki tekrar eden elementleri sadece 1 kere yazdıracak array'i kısaltan bir kod yazınız
        Hint: SET Kullanınız.
        int [] arr={1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7}
         */

        int [] arr={1,7,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5};//benzersiz halini elde etmek için set kullanılır
        Set<Integer> benzersizSet=new HashSet<>();

        //Arraydeki tüm elementleri (her birini) oluşturduğumuz set'e ekleyelim

        for (int each:arr
        ) {
            benzersizSet.add(each);

        }
        System.out.println(benzersizSet);//[1, 2, 3, 4, 5, 6, 7]  - set'teki elemanları array e taşımak
        System.out.println(Arrays.toString(arr));//arr yi bu şekilde yazdırırsak bize aşağıdaki şekilde yazdırır
                                                // [1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7] ama biz kısaltılmış halini
                                               //yazdırmak istiyoruz

        //benzersizSet i arr ye aktarmamız lazım bunun için boş bir arraay oluşturup uzunluğunu tanımlamamız gerekir
        arr=new int[benzersizSet.size()]; // [0,0,0,0,0,0,0]

        int index=0;
        for (int each:benzersizSet  //benzersizSet teki herbir elemanı alıp
        ) {
            arr[index]=each;//arr'nin sıra ile index'ine ekleyecek
            index++;

        }
        System.out.println("array'in son hali: "+ Arrays.toString(arr));

    }
}