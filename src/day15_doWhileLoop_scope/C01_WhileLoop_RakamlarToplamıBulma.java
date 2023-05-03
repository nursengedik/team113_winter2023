package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamıBulma {

    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        int sayi= girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplamı=0;


        while(sayi>0){

            birlerBasamagi= sayi%10;
            rakamlarToplamı +=birlerBasamagi;
            sayi /=10;

        }

        System.out.println("Girilen " + girilenSayi +"'nin rakamlar toplami : " + rakamlarToplamı);

        System.out.println(C02_RakamlarToplamınıBulma.rakamlarToplaminiBul(girilenSayi));

    }
}
