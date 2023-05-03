package day03_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Soru3- Kullanıcıdan ismini, soyismini, yaşını alıp aşağıdaki formatta yazdırın.

        //İsminiz   : John
        //Soyisminiz: Doe
        //Yaşınız   : 44
        //Kaydınız başarıyla tamamlanmıştır.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ismininzi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        double yas= scan.nextDouble();

        /*
        System.out.println("İsminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yaşınız : " + yas);
        System.out.println("Kaydınız başarıyla tamamlanmıştır");
         */

        //Kullanıcı istediğimiz data türünde bilgi girişi yapmazsa
        //kodumuzda hata oluşur ve çalışma durur
        //ilerde kullanıcı hatalarına karşı nasıl tedbirler alacağımızı öğreneceğiz
        //ŞİMDİLİK kullanıcı biz ne diyorsak onu tam yapıyor kabul edelim

        /* System.out.println()' deki ln
           yazdırma işlemini yaptıktan sonra
           alt satıra geçmesini sağlar
           println yerine print yazarsak
           yazdırdığımız şeyler yanyana yazdırılır
        */

        System.out.println("İsminiz : " + isim +
                           "\nSoyisminiz : " + soyisim +
                           "\nYaşınız : " + yas +
                           "\nKaydınız başarıyla tamamlanmıştır");

        /* Tek bir System.out.println() ile birden fazla satır yazdırmak isterseniz
           String bir ifadenin içinde istediğimiz yere \n (ters slaş) yazabilirsiniz

           String içerisinde boşluk verdiğimiz zaman konsolda da boşluk oluşur,
           kodlar arasındaki boşluk konsolda oluşmaz
         */








    }
}
