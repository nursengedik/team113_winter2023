package day33_pollymorphism;

import java.util.List;

public class BChild extends AParent{

    @Override //notasyon
    void method1() {
        // super.method1();
        // burada super. olursa hem child class'daki method1
        // hem de super class'daki method1 calisir

    }


    void method2(){
        /*
            bir method override edildiginde
            child class'da @Override notasyonu KULLANILABILIR

            kullanmak veya kullanmamak arasinda
            pratikte soyle bir sonuc olusur.

            eger notasyon kullanilirsa  (@Override)

            iki method arasindaki iliski takip edilir
            parent class'daki method silinirse
            notasyon CTE verir

            notasyon yoksa   (@Override)
            parent class'daki overriden method silinirse
            bir uyari verilmez, CTE olusmaz,
            method olarak işleme devam eder
         */
    }

    Double method3(){
        /*
            Overridden (geçersiz kılınan) method ile overriding (geçersiz kılan) method'un
            isim ve signature'lari ayni olmalidir

            Override : gecersiz kilma
            Overridden : gecersiz kilinan

            return type ve access modifier
            signature'a dahil degildir
            ancak overriding'de bunlarla ilgili de kurallar vardir

            1- access modifier kurali :
                child parent'i kisitlayamaz (parent public Object method3() olduğunda child Integer method3()
                                            access modifieri olmadığı için defaulttur yani daha dardır,
                                            olursa child parenti kısıtlamaya çalışmış olur,
                                            çünkü public daha geniştir, tam tersi olmalıdır
                                            parent Object method3() child ise public Integer method3() yada
                                            protected Integer method3() olursa sorun olmaz

                eger overridden ve overriding method'lari
                private yaparsak  (child private Integer method3(), parent private Object method3())
                bu iki method BAGIMSIZ OLARAK calisir
                aralarinda override islemi olmaz

             2- Return type kurali
                return type primitive veya void ise
                iki method'un return type'i AYNI OLMALIDIR

                non-primitive oldugunda
                ya ayni olmali    (child int method3() ise parent de int method3() olmalı)
                veya parent class'daki return Type
                child class'daki return type'in parent'i OLMALI
                (Covariant data )
                parent Object method3() ise child String,Integer,List<Integer> method3() olmalıdır
                çünkü parentteki Object diğerlerini kapsar
         */

        return 5.0;
    }
}