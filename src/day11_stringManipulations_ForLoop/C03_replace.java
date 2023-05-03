package day11_stringManipulations_ForLoop;

public class C03_replace {

    public static void main(String[] args) {


        String str = "Java Candir";

        System.out.println(str.replace('J', 'H')); // Hava Candir
                                                                  // replace yi char ve string olarak yazabiliriz

        System.out.println(str.replace("a", "")); // Jv Cndir-- Tüm a'ların yerine hiçlik yazdırır

        System.out.println(str.replace("Java","X")); // X Candir

        System.out.println(str.replace("v","yayaya")); // Jayayayaa Candir

        str.replace("va","lala"); // yapilan degisiklik bu satir icindir
                                                  // yazdirilmadigi icin gormeyiz
                                                 // atama yapilmadigi icin de kalici olmaz

        // str'daki space'leri yok edin

        str= str.replace(" ","");// Atama yapıldığı için değişiklik kalıcı olur

        System.out.println(str); // JavaCandir


        System.out.println(str.replaceFirst("a", "")); // JvaCandir--replaceFirst ilk a yı değiştirir
        System.out.println(str.replaceFirst("C", "K")); // JavaKandir


    }
}
