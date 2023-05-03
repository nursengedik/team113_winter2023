package day14_methodOverloading_whileLoop;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        /*
            Bir class'da ayni isme sahip
            farkli islem yapan method'lar olabilir
            Java bu method'lardan hangisinin calisacagina
            parametrelere gore karar verir
            Bir class'da ismi ayni, parametreleri farkli method'lar olmasina
            Method OVERLOADING denir.
         */

        String str = "Bu is olacak";

        //aynı isimle iki method var str replace
        //birincisinde string verildi, ikincine char değer verildi
        //java yaptığı işe göre yani aldığı parametreye göre hangi methodun çalışacağına karar veriyor

        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak

        System.out.println(str.replace('u', 'e')); // Be is olacak


    }
    //mesela
    //public static void method1(){
    //    System.out.println(0);
    //}
    //public static void method1(){
    //    System.out.println(1);
    //} altını kırmızıyla çizer hata verir çalışmaz, çünkü parametreleri aynı

}
