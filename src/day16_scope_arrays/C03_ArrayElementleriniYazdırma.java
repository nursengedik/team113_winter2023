package day16_scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdırma {

    public static void main(String[] args) {

        int[] arr = {3,5,6,7,8,1,2};

        // Tum arrray'i yazdirin

        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 7, 8, 1, 2] //Arrys class'ından yardım alınır
                                                 // köşeli parantez içinde yazdırır

        // Array'in tum elementlerini yanyana aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 0; i < arr.length ; i++) {// 0 index'ten başlayacak, arrays'ın uzunluğuna kadar gidecek

            System.out.print(arr[i] + " ");// 3 5 6 7 8 1 2 köşeli parantez içinde değil, çünkü Arrys i değil
                                           //Arrys'in elemetlerini yazdırdık
        }



    }
}      //[3, 5, 6, 7, 8, 1, 2] =====>Array
      // 3 5 6 7 8 1 2         =====>Arrays'ın elementleri
