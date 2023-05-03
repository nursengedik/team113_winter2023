package day23_constructor;

public class C04_Socrativ {

    public static void main(String[] args) {


        //soru 1

        //Asagidakilerden hangisi Constructor ile Method'un farklarindan degildir?
//
        //A
        //Constructor'larda return type yoktur, Method'larda return type olmalidir D
//
        //        B
        //Constructor'larin ismi class ile ayni olmalidir, Method'larin ismi class'dan farkli olabilir.D
//
        //C
        //Constructor'larin ismi buyuk harf ile baslar, Method'larin ismi kucuk harfle baslar.D
//
        //        D
        //Bir class'da sadece bir tane Constructor olabilir, fakat birden fazla Method olabilir.Y

        //soru 2

       // Asagidakilerden hangileri Constructor icin dogrudur?
//
       //         A
       // Her class olusturuldugunda Java otomatik olarak bir Constructor olusturur, bu Constructor'a default constructor denir.
//
       // B
       // Default Constructor'larin parametresi olmaz.
//
       // C
       // Biz bir class'da Constructor olusturdugumuzda, Java default constructor'i iptal eder.
//
       //         D
       // Constructor'lar bir class'dan yeni bir obje olusturmak icin kullanilir.
        // A-B-C-D DOĞRU

        //SORU 3

       //public class Deneme{

       //    int fiyat = 20000;

       //    int yil = 2020;

       //    String marka = "Honda";

       //    public static void main(String[] args) {

       //        Deneme hondaAraba = new Deneme( );

       //        System.out.println(hondaAraba.fiyat);

       //        System.out.println(hondaAraba.yil - 3);

       //        System.out.println(hondaAraba.marka.replace("H", "K"));

       //    }

       //}

        //Yukaridaki programin ekran ciktisi nedir?

        // A    20000     B  20000       C    20000       D  2017       c doğru
        //      2020        2020               2017         Konda
        //      Honda        Konda            Konda



       //soru 4


       //public class Deneme {

       //    String isim = "Ali Can";

       //    int yas = 33;

       //    int kilo = 85;



       //    Deneme( ){

       //    }

       //    Deneme(String isim, int yas){

       //        this.isim = isim;

       //        this.yas = yas;

       //    }

       //    Deneme(String isim){

       //        this.isim = isim;

       //    }

       //}

       //Yukaridaki class'da 3 farkli constructor verilmistir. Asagidakilerden hangisi yanlistir?

       // A
       // Deneme insan01 = new Deneme();
//
       // insan01 objesinin ismi Ali Can olur.
//
       // B
       // Deneme insan02 = new Deneme("Veli Han");
//
       // insan02 objesinin ismi Veli Han, yasi 33, kilosu 85 olur.
//
       //         C
       // Deneme insan03 = new Deneme(44, "Ayse Tan");// c yanlış, çünlü parametrenin dizilimi ile 2. contructors un dizilimi farklı
//
       // insan03 objesinin ismi Ayse Tan, yasi 44, kilosu 85 olur.

        //soru 5

       // Asagidakilerden hangileri default constructor'a sahiptir?

       // A
       // public class Deneme { }//class ın içinde bir constructors yoksa java otomatik default constructors oluşturur
//
       // B
       // public class Deneme {
//
       //     deneme() {}//  yanlış class ismi ile costructors ismi aynı olmalıdır
//
       // }
//
       // C
       // public class Deneme {
//
       //     Deneme(String name) {}
//
       // }
//
       // D
       // public class Deneme {
//
       //     Deneme() {}
//
       // }
//
       // E
       // public class Deneme {
//
       //     void Deneme() {} // yanlış class ismi ile costructors ismi aynı olmalıdır
//
       // }//  cvp A-B-E

        //soru 6

      // public class Deneme {

      //     private int sayi;

      //     boolean bl;



      //     public Deneme() {

      //         this.sayi = 11;

      //         bl= false;

      //     }



      //     public Deneme(int sayi) {

      //         this.sayi = sayi;

      //         this.bl = true;

      //     }

      //     public static void main(String[] args) {



      //     }

      // }

       // Asagidakilerden hangisi yanlistir?
//
       //         A
       // Deneme deneme = new Deneme();
//
       // System.out.println(deneme.sayi);
//
       // Output 11 dir
//
       //         B
       // Deneme deneme = new Deneme(7);
//
       // System.out.println(deneme.sayi);
//
       // Output 7 dir
//
       //         C
       // Deneme deneme = new Deneme();
//
       // System.out.println(deneme.bl);
//
       // Output false dir
//
       //         D
       // Deneme deneme = new Deneme(7);
//
       // System.out.println(deneme.bl);
//
       // Compile Time Error verir. yanlış deneme.bl yazdırdığımızda true yazdırmalıdır

        //soru 7-

       //public class Car {

       //    int fiyat = 50;



       //    public Car(int fiyat) {

       //        this.fiyat = fiyat;

       //    }



       //    public static void main(String[] args) {



       //    }

       //}

       //Hangisi ekrana 50 yazar?

       //        A
       //Car c1 = new Car(50);

       //System.out.println(c1.fiyat);  doğru

       //B
       //Car c1 = new Car();

       //System.out.println(c1.fiyat);constructors parametresiz

       //C
       //Car c1 = new Car(50);

       //System.out.println(c1); referansını yazdırır

       //D
       //Car c1 = new Car();

       //System.out.println(c1);constructors parametresiz

        //soru 8

       // public class Deneme {
//
       //     String str = "a";
//
//
//
       //     Deneme() {
//
       //         str = str + "b";
//
       //     }
//
       //     Deneme(String c) {
//
       //         str = str + c;
//
       //     }
//
       //     public static void main(String[] args) {
//
//
//
       //     } }
//
       // Hangileri dogrudur?
//
       // A
       // Deneme deneme = new Deneme("f");
//
       // System.out.println(deneme.str);
//
       // Output af dir
//
       //         B
       // Deneme deneme = new Deneme();
//
       // System.out.println(deneme.str);
//
       // Output ab dir
//
       //         C
       // Compile Time Error verir
//
       // D
       // Deneme deneme1 = new Deneme("r");
//
       // Deneme deneme2 = new Deneme();
//
       // System.out.println(deneme1.str + deneme2.str);
//
       // Output arab dir                  cvp A-B-D

        //soru 9

      //Asagidakilerden hangileri this ile this() arasindaki farklardandir?

      //A
      //this icinde bulundugumuz class'daki instance veya static variable'lara ulasmak icin kullanilir. this() icinde bulundugumuz class'daki constructor'lara ulasmak icin kullanilir.

      //B
      //this kullanildigi blok icinde herhangi bir satira yazilabilir. this() kullanildigi blok icinde ilk satira yazilmalidir.

      //C
      //this kullanildigi blok icinde birden fazla kullanilabilir. this() kullanildigi blok icinde sadece bir kere kullanilabilir.
      //        D Hepsi  dogru


        //soru 10
       // public class ThisKeyword {
//
       //     ThisKeyword(int x){
//
       //         this();
//
       //         System.out.println("Parametreli constructor");
//
       //     }
//
       //     ThisKeyword(){
//
       //         System.out.println("Parametresiz constructor");
//
       //     }
//
       //     public static void main(String[] args) {
//
       //         ThisKeyword obj = new ThisKeyword(7);
//
       //     }
//
       // }
//
       // Yukaridaki programin ekran ciktisi nedir?
//
       //         A
       // Parametresiz constructor
//
       // Parametreli constructor
//
       // B
       // Parametreli constructor
//
       // Parametresiz constructor
//
       // C
       // Parametresiz constructor
//
       // Parametresiz constructor
//
       // D
       // Parametreli constructor
//
       // Parametreli constructor



















    }
}
