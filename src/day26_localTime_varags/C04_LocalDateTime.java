package day26_localTime_varags;

import java.time.LocalDateTime;

public class C04_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2023-03-09T19:52:19.853956- hem tarihi hem de saati gösterir

        System.out.println(ldt.toLocalDate());//saati bırakıp sadece tarihi alıyor
    }
}