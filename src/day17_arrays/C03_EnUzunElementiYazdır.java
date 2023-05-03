package day17_arrays;

public class C03_EnUzunElementiYazdır {

    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr1 = {"Melike", "Burkay","inci","Eda","Emre","Ali"};

        enUzunEnKisaYazdir(arr1); // Burkay , Ali


        String[] arr2 = {"Melike", "Burkay","inci","Eda","Emre","Huseyin","Su"};

        enUzunEnKisaYazdir(arr2); // Melike , Eda


    }

    public static void enUzunEnKisaYazdir(String[] arr){
        String enUzunKelime=arr[0];//arr'nin elemanları ile kıyaslama yapılacağı için
        String enKisaKelime=arr[0];//String enUzunKelime=""; hiçlik mantıklı olmaz,
                                  //arr'nin herhangi bir elemanı yazılır

        for (int i = 0; i < arr.length ; i++) {//arrays'in tüm elementlerini fr loop ile elden geçirebiliriz

            if(arr[i].length()>=enUzunKelime.length()){//en uzun Melike ve Berkay aynı uzunlukta,uzunlukları eşit
                enUzunKelime=arr[i];                   // = denilince sondakini yani Berkay yazdırır,
            }                                          // = denilmeyince Melike yazdırır

            if(arr[i].length()<=enKisaKelime.length()){//en kısa kelimede de aynı işlemi yapar
                enKisaKelime=arr[i];
            }
        }

        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);
        System.out.println("Array'deki en kisa kelime : " + enKisaKelime);
    }
}
