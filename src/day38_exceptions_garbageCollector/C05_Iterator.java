package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(61);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        Iterator it1 = sayilar.iterator();//ıterator interface olduğu için new kullanarak obje oluşturamayız
                                         //list üzerinden ıterator oluşturmuş olduk, bunu yapınca list in başına I koyar
        while (it1.hasNext()){//yanında obje olduğu müddetçe varsa ilerler olmayınca false döner ve biter

            Integer sayi = (Integer) it1.next();//it1.next() obje getirdiği için Integer e cast ederiz

            if (sayi%2 == 0){
                it1.remove();
            }
        }

        System.out.println(sayilar);
    }
}