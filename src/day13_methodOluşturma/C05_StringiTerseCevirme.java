package day13_methodOluşturma;

public class C05_StringiTerseCevirme {

    public static void main(String[] args) {

         // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(stringTersineCevir("Java Candir"));   //birçok kez çağırma işlemi yapılabilir ve
        System.out.println(stringTersineCevir("Anlasildi mi?"));//bunun sonucunda birçok kez sonuç
        System.out.println(stringTersineCevir("Soyle Omer"));  //yazdırır.

    }

    public static String stringTersineCevir(String metin){ // Java

        String tersMetin=""; // avaJ

        for (int i = metin.length()-1 ; i >=0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    }
    }

