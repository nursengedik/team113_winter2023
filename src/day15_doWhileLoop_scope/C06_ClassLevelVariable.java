package day15_doWhileLoop_scope;

public class C06_ClassLevelVariable {

     /*
        Bir class icinde tum method'larin erisebilecegi variable'lar istenirse
        Class Level'da (Class'in icinde ama method'larin disinda) olusturulmalidir
        1- Class Level'da olusturulan variable'larin scope'u tum class'dir
        2- Class level'da olusturulan variable'lara deger atanmasa bile
           Java onlar icin tanimlanmis DEFAULT DEGERLER atar
        3- Class level'da olusturulan variable'lar static veya instance(static olmayan) olabilir
        4- static olarak tanimlanan variable'lar tum method'larda direk kullanilabilir
        5- method static ise, icerisine static olmayan hicbir sey almaz
     */

        static int sayi = 10;
        static String isim;
        static boolean bl;
        static char chr;
        static int in1;
        int in2;
        boolean bl2;

        public static void main(String[] args) {
            System.out.println(sayi);
            System.out.println("String : " + isim); // non-primitive turler icin null //değer atanmasa bile
                                                                               //kullanılabilir ve yazdırılabilir
            System.out.println("boolean : " + bl); // false
            System.out.println("char : " + chr); // '' hiclik
            System.out.println("int : " + in1); // sayisal turler icin 0
            // System.out.println(bl2); instance
            staticMethod();
            // staticOlmayanMethod();//main methodun içinde static olmayan method da kullanılmaz
        }

        public static void staticMethod(){
            sayi++;
            System.out.println(sayi); // s
            System.out.println(chr); // s
            //System.out.println(in2); // instance
            //System.out.println(bl2); // instance//static methodlar seçicidir, static olmayan variable'ı
                                                  //kabul etmez

        }

        public void staticOlmayanMethod() {
            sayi--;
            System.out.println(sayi);//s//method static olmadığı halde static variable'ı kullanabilir çalışır
                                        //çünkü static variable'lar tüm methodlarda kullanılabilir
            System.out.println(bl); //s
            System.out.println(in2); // instance
            System.out.println(bl2); // instance //burada static olayan variable kullanılabilir çünkü
                                                //method da static değil  kabul eder
        }

}//Class level'de oluşturulan bir variable 3 methodda da kullanılabilir ancak java yukarıdan aşağıya
// çalıştığı için variable 1. methodda çalışır ve biter diğerlerinde çalışmaz ör: static int sayi = 10;
