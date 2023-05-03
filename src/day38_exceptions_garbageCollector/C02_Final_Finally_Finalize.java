package day38_exceptions_garbageCollector;

public class C02_Final_Finally_Finalize {

    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE); // -2147483648

        // Integer.MIN_VALUE = 3; Constant (sabit) Data //sabittir değiştirilemez

        System.out.println(Math.PI); // 3.141592653589793 - pi sayısı


        try {

            System.out.println( 10 / 0 );//exceptions oluştu ve catch e kadar aradaki kodları çalıştırmayacak
            System.out.println("bolmenin sonrasindaki satir");

        } catch (Exception e) {// catch bloğu çalışır     exceptions olmadığı

            System.out.println("catch blogundaki satir");

        } finally {//burası da çalışır

            System.out.println("finally blogundaki satir");

        }

    }//catch in çalışması try ın çalışmadığı ve hata oluştugu anlamını taşır ama finally her halukarda çalışır
}


  //eğer
       // try {
      //      System.out.println( 10 / 5 );   olsaydı
       //     System.out.println("bolmenin sonrasindaki satir");

      //try de hata oluşmadığı için catch bloğu çalışmaz ama finally her halukarda çalışır