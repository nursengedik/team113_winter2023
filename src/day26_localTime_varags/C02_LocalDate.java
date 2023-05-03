package day26_localTime_varags;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2023-03-09
        //bu günkü tarih

        System.out.println(tarih.isLeapYear()); // false
        //artık yıl mı diye bakar

        LocalDate tarih2 = LocalDate.of(2020,10,10);

        System.out.println(tarih2.isLeapYear());//yukarıdaki tarih artık yıl mı

        System.out.println(tarih.plusWeeks(20).plusDays(2)); // 2023-07-29
        //şu andaki tarihten 20 hafta ve 22 gün sonraki tarihi yazdırır (plus eklemek)

        System.out.println(tarih.minusMonths(3).minusDays(3)); // 2022-12-06
        //şu andaki tarihten 3 ay ve 3 gün önceki tarih (minus azaltmak)

        System.out.println(tarih.withYear(1923).withMonth(5)); // 1923-05-09
        //olasını istediğimiz tarihi yazdırır

        System.out.println(tarih.getDayOfYear()); // 68
        //bu gün yılın kaçıncı günü

        System.out.println(tarih.getMonth()); // MARCH- hangi ayda olduğumuzu
        System.out.println(tarih.getMonthValue()); // 3-bulunduğumuz ay kaçıncı aydır

        LocalDate tarih3 = LocalDate.of(1980,1,1);
        System.out.println(tarih3.getDayOfWeek()); // TUESDAY -yukarıda verilen tarihte haftanın hangi olduğunu
                                                  //yazdırır

        System.out.println(tarih.isBefore(tarih3)); // false-bizim tarihimiz tarih 3 ten önce mi
        System.out.println(tarih.isAfter(tarih3)); // true-bizim tarihimiz tarih 3 ten sonra mı


    }
}
