package day37_exceptions;

import java.util.Scanner;

public class C01_ThrowKeyword {

         /*
            Kodlari yazarken bazen muhtemel bir durumda
            bazi kodlarin ignore edilmesi istenebilir
            bu durumda kodlari IGNORE etme yontemi olarak
            isteyerek exception firlatip
            sonra da calismasini istedigimiz yerde
            catch ile yakalayip yolumuza devam edebiliriz
         */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas= scan.nextInt();

        try {
            if (yas<0){//yaş negatif olmaz
                throw new IllegalArgumentException("Hatalı Parametre girişi yapıldı!");//burada kullanıcıya mesaj
                //verip kontrollü hata oluşturuyoruz yani exceptions fırlatıyoruz, sadece try oluşturup
                //çalıştırdığımızda mesajı verir ve devamında kod çalışmaz exit code 1 olur, catch ekleyip kullanıcıya
                //ne yapması gerektiği mesajını verince kod çalışır ve durmadan çalışmaya devam eder exit code 0 olur
            }else{
                System.out.println("Başarılı bir şekilde kayıt yapıldı.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();

        }
    }
}