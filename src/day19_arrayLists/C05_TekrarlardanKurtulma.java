package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturun


        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};// tüm elementleri Arry List ile silmek uzun iştir

         //takip edeceğimiz yol
        // bir tane bos list olusturalim
        // array'deki her bir elemani ele alalim
        // ele aldigimiz element list'de yoksa ekleyelim, varsa eklemeyelim
        // boylece benzersiz elementlerden olusan bir list olusturalim

        List<Integer> benzersizElementlerList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
                                                            //contains içerir mi demek
            if (!benzersizElementlerList.contains(arr[i])){//benzersizElementlerList'si arr[i]'yi içerir mi
                benzersizElementlerList.add(arr[i]);      //içerirse bu list'te arr[i]'yi ekle demektir
            }
        }

        System.out.println(benzersizElementlerList); // [3, 4, 5, 6, 2, 7]

        // istenen listeyi list olarak elde ettik
        // bunu arr'ye direk atayamayiz

        arr= new int[benzersizElementlerList.size()]; // [0, 0, 0, 0, 0, 0] //arr'ye yeni bir değer atanır
                                                      //benzersizElementlerList'nin uzunluğu kadar

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = benzersizElementlerList.get(i);//get'e index veririz elementi getirir
        }


        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 2, 7]


    }
}