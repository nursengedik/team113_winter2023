package day26_localTime_varags;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        //iki tarih arasındaki zaman dilimini gün, ay, yıl alamak için kullanılır


        LocalDate dogumTarihi = LocalDate.of(1980,1,1);
        LocalDate bugun= LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P43Y2M8D
        //doğum tarihi ile bugün arası(between)

        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getYears()); // 43
        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getDays()); // 8

    }
}