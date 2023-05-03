package day24_staticKeyword;

public class C04_Socrativ {

    public static void main(String[] args) {

        //soru 1- Asagidakilerden hangileri Static variable ile Instance variable arasindaki farklardan degildir?
        //
        //A
        //Static variable Class variable olarak da adlandirilir Instance variable ise Object variable olarak adlandirilir.
        //
        //B
        //Static variablelara baska classlardan Class ismi kullanilarak
        //
        // ulasilabilir, fakat Instance variablelara baska classlardan ulasabilmek
        //
        //icin Object olusturmak gerekir.
        //
        //C
        //Static variablelarda yapilan degisiklikler butun Objectler tarafindan
        //
        // gorulur, fakat Instance variablelarda yapilan degisiklikler sadece bir
        //
        //Object tarafindan gorulur.
        //
        // D   doğru   pdf syf 125
        //Static variablelara deger atamasi yapilmak zorundadir, fakat Instance variablelara deger atamasi yapilmasa da olur, Java Instance variablelara default valuelar atar.


        //soru 2-

      // public class Static01 {

      //     String isim = "Ali Can";

      //     static int yas = 44;

      //     public static void main(String[] args) {

      //     }

      // }



      // public class Static02 {

      //     public static void main(String[] args) {

      //         Static01 obj1 = new Static01();

      //         System.out.print(obj1.isim);

      //         System.out.println(Static01.yas);

      //     }

      // }



       //Yukaridaki program ile ilgili asagidakilerden hangisi dogrudur?

       //        A
       //"yas" variable'i Static02 Class'inin main methodu icinden cagrilirken hata yapilmistir.

       //        B  doğru
       //Ekrana Ali Can44 yazdirir.

       //C
       //obj1 Object'i olusturulurken hata yapilmistir.

       //D
       //"isim" variable'i Static02 Class'inin main methodu icinden cagrilirken hata yapilmistir.



     //soru 3

      //public class Static01 {

      //    String isim = "Ali Can";

      //    static int yas = 44;

      //    public static void main(String[] args) {

      //        System.out.print(isim);

      //        System.out.print(yas);

      //    }

      //}

      //Yukaridaki program ile ilgili asagidakilerden hangisi dogrudur?

      //        A
      //Compile Time Error verir. doğru, çünkü obje oluşturulmamış, obje oluşturmadan verileri kullanamayız

      //B
      //Run Time Error verir.

      //C
      //Ekran ciktisi Ali Can44 olur.

        //soru 4-

               // 1) public class Static01 {
//
               // 2) 	String isim = "Ali Can";
//
               // 3)     static int yas;
//
               // 4) public static void main(String[] args) {
//
               // 5)        Static01 obj1 = new Static01();
//
               // 6)        System.out.print(obj1.isim);
//
               // 7)        System.out.print(obj1.yas);
//
               // 8)	 }
//
               // 9)}

      // Yukaridaki program ile ilgili asagidakilerden hangisi dogrudur?

      //         A
      // 6 numarali satirda hata yapilmistir.

      // B
      // 7 numarali satirda hata yapilmistir.

      // C
      // Ekran ciktisi Ali Can0 olur.   doğru

      //         D
      // 3 numarali satirda hata yapilmistir. class da yas değeri tanımlanmasa da null değerini yazdırır


        //soru 5-

       //public class MyClass {

       //    int x = 1;

       //    static int y;

       //    MyClass(int i){

       //        x = x + i;

       //        y = y + i;

       //    }

       //    public static void main(String[] args) {

       //        MyClass obj1 = new MyClass(5);

       //        System.out.println(obj1.x + ", " + obj1.y);

       //        MyClass obj2 = new MyClass(7);

       //        System.out.println(obj2.x + ", " + obj2.y);

       //    }

       //}

       //Yukaridaki programin ekran ciktisi nedir?

       //        A
       //6, 5

       //8, 5

       //B
       //6, 5

       //8, 12

       //C
       //6, 5

       //13, 5

       //D
       //6, 5

       //13, 12

        //soru 6-

       // public class MyClass {
//
       //     int sayi;
//
       //     String isim = "Ali";
//
       //     MyClass(){
//
       //         char harf = 'c';
//
       //     }
//
       //     MyClass(int sayi){
//
       //         this.sayi = sayi;
//
       //     }
//
       //     void MyClass(){
//
       //         sayi++;
//
       //     }
//
       //     artir(int sayi){
//
       //         isim++;
//
       //     }
//
       // }
//
       // Yukaridaki program ile ilgili asagidakilerden hangileri dogrudur?
//
       //         A
       // sayi ve isim isimli variablelar "Instance" variable'lardir.
//
       // B
       // "MyClass" isimli iki tane Constructor vardir.
//
       //         C
       // "MyClass" isimli bir tane Method vardir.
//
       //         D
       // Iki tane Compile Time Error vardir    cvp A B C D olacak


        //soru 7-

     // public class Static03 {

     //     static String ad = "Ali Can";

     //     static int kilo = 33;

     //     public static void main(String[] args) {

     //     }

     //     public static void artirma() {

     //         kilo++;

     //         System.out.println(kilo);

     //     }

     // }



     // public class Static04 {

     //     int num1 = 12;

     //     static int num2 = 22;

     //     public static void main(String[] args) {

     //         Static03.artirma();

     //         Static03 obj = new Static03();

     //         obj.artirma();

     //         obj.artirma();

     //     }

     // }

     // Yukaridaki programin ekran ciktisi nedir?

     //         A   doğru
     // 34

     // 35

     // 36

     // B
     // 34

     // 34

     // 34

     // C
     // 33

     // 33

     // 33

     // D
     // 33

     // 34

     // 34

        //soru 8-

      // public class Static04 {

      //     int num1 = 12;

      //     static int num2 = 22;

      //     public static void main(String[] args) {

      //         Static04 obj = new Static04();

      //         obj.artirma();

      //         obj.artirma();

      //     }

      //     public void artirma() {

      //         num1++;

      //         System.out.println(num1);

      //     }

      // }

      // Yukaridaki programin ekran ciktisi nedir?

      //         A  doğru
      // 13

      // 14

      // B
      // 13

      // 13

      // C
      // 14

      // 14

      // D
      // Program calismaz

        //soru 9-

      //Asagidakilerden hangisi Static Block'lar icin dogru degildir?

      //A
      //Static Block'lar variable'lara deger atamasi yapmak icin kullanilir.

      //B  şıkkı
      //Static Block'lar class'daki tum methodlardan(main method haric) ve constructorlardan once calisir.
        //class daki herşeyden önce çalışır main methoddan bile önce

      //C
      //Static Block olusturmak icin syntax  ==>  static { }

      //D
      //1'den fazla static block varsa ustteki once calisir.













    }
}
