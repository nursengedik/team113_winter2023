package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar tamsayi alip toplayin
        // Kullanici q'ya bastiginda islemi sonlandirip
        // kac sayi girildigini ve toplamini yazdirin
        // q veya Q disinda tamsayi olmayan bir deger girilirse
        // hata mesaji verip, yeni deger isteyerek isleme devam edin


        int sayac=0;
        int toplam=0;
        int girilenSayi=0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("toplanmak uzere tamsayi giriniz \nBitirmek icin q'ya basin");

            try {

                girilenSayi= scan.nextInt(); // q,Q veya gecersiz baska input girerse exception olusur (riskli sayı)
                toplam += girilenSayi;      //burada sorunla karşılaşabiliriz, 3 satırı seçip try ile çevreleriz
                sayac++;//try de sorun olmazsa catch çalışmaz

            } catch (InputMismatchException e) {//try de bir sorun oluştuğu durumda çalışır

                char input = scan.next().charAt(0);//satır 28 de sorun yaşarsa kullanıcıdan değeri char alacak

                if (input=='q' || input == 'Q'){//ve kontrol edilir
                    System.out.println("girilen " + sayac + " adet tamsayinin toplami : " + toplam);
                    break;
                }else{
                    System.out.println("Tamsayi degeri girmelisiniz");
                }

            }


        }while(true);//girilensayı q olana kadar yazamayacağımız için true deriz

        System.out.println("Bu is bu kadar");
    }
}