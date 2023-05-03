package day17_arrays;

import java.util.Arrays;

public class C08_sort_binarySearch {

    public static void main(String[] args) {

        // Verilen bir array'i natural order'a gore siralamak icin
        // Arrays.sort() kullanilir

        int[] arr1= {3,9,6,1,7};//arrays'in elemanlarını sıralama
        Arrays.sort(arr1);     //önce sort'la sıralarız sonra yazdırırız

        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"Hasan","Huseyin","Mehmet","Mesut","Mercan","ali"};
        // [Hasan, Huseyin, Mehmet, Mercan, Mesut, ali]
       //küçük a'nin değeri büyük harflerin değerinden büyük olduğu için daha sonra yazdırır

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // sort yapildiktan sonra
        // array'de bir elementin var oldugunu kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr2, "ali")); //arr2'de "ali" var mı demektir
    }
}
