package day17_arrays;

import java.util.Arrays;

public class C04_SagaKaydırma {

    public static void main(String[] args) {

          // Verilen int bir array'deki tum elementleri bir saga kaydirip
         // sondaki elementi de en basa alip kaydedin
        // orn : [3,4,5,6]  ==> son hali : [6,3,4,5]

        int[] arr= {3,4,5,6};

        int temp = arr[arr.length-1];//arr'nin son index'ini bulma

        for (int i = 0; i < arr.length-1 ; i++) {

            arr[arr.length-1-i] = arr[arr.length-2-i];//kodun dinamik olması için arr[3]=arr[2]; arr[2]=arr[1];
        }                                             //arr[1]=arr[0]; yerine arr.length-1=arr.length-2 yazılır
                                                     //i'ye bağlı değişeceği için arr.length-1-i=arr.length-2-i
        arr[0]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
