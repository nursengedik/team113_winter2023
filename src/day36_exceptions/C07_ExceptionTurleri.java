package day36_exceptions;

public class C07_ExceptionTurleri {


    public static void main(String[] args) {

        String str=null;

        System.out.println(str); // null

        // System.out.println(str.concat("Java")); // NullPointerException


        String str1 = "34";
        String str2 = "23a";

        // String olarak verilen sayilarin toplamini yazdirin

        // System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2)); // NumberFormatException
                                                                           // (23a yı number formatına çeviremezsin)
       // str2 de 23 ün yanına harf eklediğimiz için toplamaz hata verir


        String str4 ="Java Candir";

        Object obj = str4;//object sitringin parentidir, kapsar

        // Integer a = (Integer) obj; // ClassCastException (teorik olarak obje classından bir objeyi ıntegere
        // çevirebilirsin ama içeriği kabul edemem diyor, sitringi integere çeviremem)

    }  //Integer a =str4 ü kabul etmedi, str4 ü Object e çevirdik ve Integer a = obj yi cast ederk kabul etti
}
