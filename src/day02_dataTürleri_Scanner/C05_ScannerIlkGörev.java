package day02_dataTürleri_Scanner;

import java.util.Scanner;

public class C05_ScannerIlkGörev {

    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın
        //ve sayının karesini yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");

        double girilenSayı=scan.nextDouble();

        System.out.println("Girilen sayının karesi:"+ girilenSayı*girilenSayı);


    }
}
