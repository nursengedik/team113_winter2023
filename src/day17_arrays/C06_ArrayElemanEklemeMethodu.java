package day17_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMethodu {

    public static void main(String[] args) {

        // soru 7-verilen bir array'e istenen bir elementi ekleyip,
        //        yeni halini bize donduren bir method olusturun

        int[] arr = {2,4,7,8};

        // arr'ye method'u kullanarak 5 ekleyin

        arr=arrayeElementEkle(arr,5);//[2, 4, 7, 8, 5]
        arr=arrayeElementEkle(arr,3);//[2, 4, 7, 8, 5, 3]
        arr=arrayeElementEkle(arr,19);//[2, 4, 7, 8, 5, 3, 19]

        System.out.println(Arrays.toString(arr));//[2, 4, 7, 8, 5, 3, 19]


    }

    public static int[] arrayeElementEkle(int[] arr , int eklenecekElement){
                                                             //önce yeni array oluşturulur
        int[] yeniArr= new int[arr.length+1]; // [0,0,0,0,0]//yeni array'in uzunluğu eskinin 1 fazlası olacak

        for (int i = 0; i < arr.length ; i++) {//daha sonra for loop'la eski elementleri kaybetmemek için
                                               //yeni array'e atanır
            yeniArr[i]=arr[i];
        } // yeniArr [2,4,7,8,0]

        yeniArr[yeniArr.length-1] = eklenecekElement;//daha sonra yeni elementi ekleriz

        return yeniArr;


    }

    public static class C05_ArrayeElemanEkleme {

        public static void main(String[] args) {

     /*
                int[] a = {4,5,6};//a'ya bu haliyle dururken 4. elementi ekleyemeyiz, başka bir yerde arrays
                int[] b = {4,5,6,10};//oluşturup onu atayarak yapabiliriz
                a = b ; //b'nin değerini a'ya ata demektir

                int[] c={1,2,3};
                int[] d={3,4,5,6};//konsolda 1,2,3,4 ü yazdırmaz, c'nin uzunluğu değişmeden d'nin değeri atandığı
                                  //için [3,4,5,6] yazdırır

                System.out.println(Arrays.toString(a));
                Array'in uzunlugu degistirilmez
                Ancak array'e yeni bir array degeri atanabilir (C01 arrays'i yeni haliyle yazdır)
             */

            // Verilen array'e istenen elementi ekleyelim
            int[] arr = {4,5,6};
            int eklenecekElement = 10;


            // arr = new int[4]; // [0,0,0,0] direk atama yaparsak eski degerler kaybolur
            // once istenen uzunlukta yeni bir array olusturup
            // eski array'deki tum elementleri yeni array'e tasiyoruz
            // sonra istenen elementi de atayip
            // yeni istedigimiz hale gelince
            // eskiArr = yeniArr; diyerek yeni array'in degerini eskisine atiyoruz

            int[] yeniArr= new int[arr.length+1]; // [0,0,0,0] //lengt'i 4 olan bir arrys oluşturduk

            for (int i = 0; i < arr.length ; i++) {
                                                   //eski arrys'deki elementleri kaybetmeden yeniye atayabilmek için
                yeniArr[i]=arr[i];          //yeni arr'nin i'nci elementine eski arr'nin i'nci elementini atayacağız
            }                              // yeniArr [4,5,6,0]

            yeniArr[yeniArr.length-1] = eklenecekElement; // [4,5,6,10]

            System.out.println(Arrays.toString(yeniArr)); // [4, 5, 6, 10] //yeni arrays

            arr = yeniArr;//yeni arrays'i eski arrays'e atadık

            System.out.println(Arrays.toString(arr)); // [4, 5, 6, 10]//yazdırdık

        }
    }
}
