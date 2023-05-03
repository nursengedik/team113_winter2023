package day26_localTime_varags;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(14,15);//new kullanılmıyor
        System.out.println(saat1); //  14:15

        LocalTime saat = LocalTime.now();//saat-dk-sn-nano sn
        System.out.println(saat); // 18:52:55.322996

        // LocalTime objesi olan saat variable'i canli bir saat degildir
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour()); // 18
        // get method'lari localTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));
        //şu andaki saate 2 saat 10 dk eklemektir

        System.out.println(saat.minusMinutes(10).minusSeconds(10));
        //şu andaki saatten 10 dk 10 sn çıkarmak

        System.out.println(saat.withSecond(10).withNano(20));
        //saati değiştirmeden istediğimiz kısmını değiştirme

        System.out.println(saat.compareTo(saat1)); // ayni ise 0 doner, aynı değilse 1 veriyor

        System.out.println(saat.isAfter(saat1)); // true
        //saat 1 den sonra mı

        System.out.println(saat.isBefore(saat1)); //
        //saat

        System.out.println(saat.toSecondOfDay()); // 69077
        //şu anda günün kaçıncı saniyesindeyiz

    }
}
