package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {

    public static void main(String[] args) {

        int[][] arr = {{3,4,5},{2,3},{1}};

        // int[][] iki katli array belirtir
        // ilk [] ana array'i (outerArray) kontrol eder
        // ikinci[] ise icerdeki array'leri (innerArray) kontrol eder

        System.out.println(arr[1][1]); // 3

        System.out.println(arr[0][2]); // 5

        System.out.println(arr[2].length); // 1

        System.out.println(arr[1]); // [I@3b6eb2ec //arr'ni 1. index'i {2,3}'tür, bu da bir arrays olduğu
                                                     //için direk yazdırılamaz

        System.out.println(Arrays.toString(arr[1])); //  [2, 3]

        System.out.println(Arrays.toString(arr)); // [[I@1e643faf, [I@3b6eb2ec, [I@6e8dacdf]
                                                 //arr'nin içinde de arraysler olduğu için arr arrays'ini de
                                                 //yazdıramayız

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]]

        System.out.println(arr.length); // 3- çünkü dış arrays'i dikkate alır, dış arrays'in içinde 3 tane
                                       // arrays var


         //MDA'da dikkat etmemiz gereken şey yazdırmak istediğimiz veya ulaşmak istediğimiz elementin
        // bir arrays mı yoksa bir element mi olduğu
    }
}
