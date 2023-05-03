package day35_interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 5;

                                            //matematiksel hata
        System.out.println(sayi1 / sayi2); // ArithmeticException (sonuç belirsiz olduğu için bu hatayı verir)
                                         //teknik olarak hata vermez, çalıştırılınca hata verir 20/0 belirsizdir
                                        //hata vermemesi için if içerisinde kullanılır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi3 = 0; // InputMismatchException //bu satır işaretlenir ve Code/Surround With/try-catch  seçilir

        //her zaman if ile sorun çözülemeyebilir,

        try {//bu işlemi yapmaya çalış demektir
            sayi3 = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Sana tamsayi yaz dedikkkkk .... ");
        }

        //if le sorunun çözülmesi

        if (sayi3 == 0) {
            System.out.println("sifir giremezsiniz");
        } else {
            System.out.println(sayi1 / sayi3);
        }


    }
}
