package day27_StringBuilder;

public class C06_Socrativ {

    public static void main(String[] args) {

        //soru 1-int arr[] = {1, 3, 5};
        //
        //for(int each : arr) {//eac herbir demektir-arr den herbir int i getir demektir
        //
        //   System.out.print(each + " ");
        //
        //}
        //
        //Ekran ciktisi nedir? a şıkkıdır
        //
        //A
        //1 3 5
        //
        //B
        //each each each
        //
        //C
        //9
        //
        //D
        //1
        //
        //3
        //
        //5


        //soru 2-

      //int arr[] = {1, 3, 5};

      //int x = 0;

      //for(int each : arr) {

      //    x = x + each*each;

      //}

      //System.out.print(x);//for each ın içinde işlem olduğu zaman print for dışına yazılır

       // Ekran ciktisi nedir? cvp B
//
       //         A
       // 9
//
       // B
       // 35
//
       // C
       // Run Time Error
//
       //         D
       // Compile Time Error


        //SORU 3-


       // int arr[][] = { {1, 2}, {3}, {4, 5, 6} };
//
       // int sum = 0;
//
       // for(int[] each : arr) {//arr nin içindeki her bir int ten oluşan arrays leri getir
//
       //     for(int z : each){//each deki herbir (z) int leri yani elemanları getir
//
       //         sum = sum + z;
//
       //     }
//
       // }
//
       // System.out.println(sum);

      //ekran çıktısı nedir? cvp A 21

       // A
       // 21
//
       // B
       // 20
//
       // C
       // 19
//
       // D
       // 186


        //soru 4-

        //int arr[][] = { {1,2,3}, {4}, {5, 6}};

       //Yukarida verilen multi dimensional array ile ilgili asagidakilerden hangisi yanlistir?   C yanlış

       //A
       //System.out.println(arr.length);

       //Ekrana 3 yazdirir

       //        B
       //for(int[] w : arr){//arr deki her bir intıcır arrays ini getir

       //    System.out.print(w.length + " ");//çünkü  for each arr den elemanları {1,2,3} {4} {5, 6} parantez
        //                                   // olmadan aralarında boşluk olacak şekilde getirir, w arraylerden
        //                                   //oluştuğu için her bir arrays in uzunluğunu boşluk bırakarak
                                            //ayrı ayrı alır
       //}

       //Ekrana 3 1 2 yazdirir

       //        C
       //System.out.print(Arrays.toString(arr[1]));//arr nin 1. index indeki elementi de arrays olduğu için
        //direk yazdırılamaz ,Arrays.toString ile yazdırılır

       //Ekrana [1, 2, 3] yazdirir   [4] olacak


        //soru 5-

       //int arr[] = {12, 21, 13};

       //for(int each : arr) {

       //    System.out.print(each + " ");//elemanları yazdırır arrays i değil

       //}

       //Asagidakilerden hangisinin ekran ciktisi yukaridaki ile aynidir?  A şıkkı

       //        A
       //int arr[] = {12, 21, 13};

       //for(int i=0; i<arr.length; i++) {

       //    System.out.print(arr[i] + " ");

       //}

       //B   yanlış
       //int arr[][] = { {12}, {21}, {13} };

       //for(int[] w : arr) {//arr nin herbir elemanını getir ve bu elemanlar da birer arrays dir

       //    System.out.print(w + " ");//arrays ları direk yazdıramayız, yazdırırsak referanslarını verir

       //}

       //C
       //        Hicbiri


        //soru 6-


      // public static void main(String[] args) {

      //     int arr[] = { 1, 3, 5, 7, 9 };

      //     for (int a : arr) {

      //         System.out.print(a + " ");

      //         if(a>4) {//a 4 ten büyük olunca break yani işlemi sonlandır, a 4 ten büyük olana kadar
                          //döngü devam eder, bir de önce yazdırıp sonra şartı kontrolettiği için 5 i yazdırır
      //              break;// if e gelince 5>4 şartını sağlayınca işlemi sonlandırır

      //         }

      //     }

      // }

      //  What is the output? çıktısı nedir  A şıkkı
//
      //  A
      //  1 3 5
//
      //  B
      //  1 3
//
      //  C
      //  1 3 5 7 9
//
      //  D
      //          None


      // soru 7-


       //Asagidakilerden Hangileri dogrudur ?   B C E doğru

       //        A
       //Immutable bir object degistirilebilir

       //B
       //Immutable bir object degistirilemez

       //C
       //Immutable bir object garbage collector tarafindan toplanabilir

       //        D
       //Immutable bir object garbage collector tarafindan toplanamaz

       //        E
       //String class ve bu class'dan olusturulan objeler immutable'dir.


        //soru 8-


       //String s= "purr";

       //s.toUpperCase();// büyük yazdırır ama atama veya yazdırma olmadığı için önemi yok dikkate alınmaz

       //s.trim();//space leri yani yandaki boşlıkları siler ama atama veya yazdırma olmadığı için önemi yok
                 // dikkate alınmaz

       //s.substring(1,3);// 1. index ten başla 3. index e kadar al, ama atama yapmadığı için değişiklik diğer
                          //satırda dikkate alınmaz
        // 3 method da dikkate alınmaz
       //s+=" two"; //en basta bir bosluk var  //yani yine purr+ two=8

       //System.out.println(s.length());// uzunluk soruluyor  8 dir



       //Yulkaridaki kod calisirsa konsolda cikacak sonuc nedir?

       //        A
       //2

       //B
       //4

       //C    doğru
       //8

       //D
       //10

       //E
       //Run Time Error olusur

       //F
       //Kod calismaz


        //soru 9-

      //int sayi=4;

      //String isim="tuna";

      //String isim2=sayi+1;

      //System.out.println(isim2+ " " + isim);

      //System.out.println(sayi+ " " + 1);



      //Yukaridaki kod calisirsa asagidakilerden hangileri consolda gorunur ?

      //        A
      //4 1

      //B
      //41

      //C
      //5

      //D
      //5 tuna

      //        E
      //5tuna

      //        F
      //51tuna

      //        G
      //Kod calismaz.   doğru



        //soru 10- pdf-132 syf

      //String s="Hello"; //normal oluşturulmuş

      //String t= new String(s);//t new keywordle oluşturulmuş yani yeni obje oluşturulmuş, stack memory de
                               // ayrı bir yerde oluşur, kensisinden önce oluşturulan sitringlere bakmaz

      //if ("Hello".equals(s)) System.out.println("one");//equals string havuzunda sadece değerlere bakarak
                                                        //karşılaştırma yapar
      //if(t==s)System.out.println("two");//t new keywordle oluşturulmuş
                                         //== hem değerleri hem de referansları karşılaştırdığı için bu şart
                                        //sağlanmaz

      //if(t.equals(s)) System.out.println("three");//burada sadece metinlere bakar doğrudur

      //if("Hello"==s)System.out.println("four");//"Hello" verdiğinde havuzdan olduğunu düşünmeliyiz

      //if("Hello"==t)System.out.println("five");//"Hello" havuzdan t havuzdan değil yazdırmaz



      //Yukaridaki kod calisirsa asagidakilerden hangileri consolda gorunur ? A C D olacak

      //        A
      //one

      //        B
      //two

      //        C
      //three

      //        D
      //four

      //        E
      //five

      //        F
      //Kod calismaz






    }
}
