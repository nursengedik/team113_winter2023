package day02_dataTürleri_Scanner;

import java.util.Locale;

public class C03_NonPrimitiveDataTürleri {

    public static void main(String[] args) {

        String isim = "Ali Can";

        String ilkHarf="K";
        char ilkHarf2='m';

        //tek bir karakter atayacaksak ikisini de kullanabiliriz

        System.out.println(ilkHarf.toLowerCase());//k yazdırır
        System.out.println(ilkHarf2);

        //primitive data türündeki variable'lar sadece DEĞER tasıyabilir
        //non-primitive data türündeki variable'ların hem DEĞER hem de METHOD'ları olur

        String metin="lıjglıjdrgojdgjidjgidgjidfgji"+
                "ıhfdgşdıhşgıdşgıdşgıjdşlgıjdşlgjdş"+
                "hgşsdışlsdjlsdjflsdkjildsjisdlfdfl"+
                "gşldfşlvdjfvşljdvlkjdlvjdlvjdkjvdj"+
                "dkhvşsdhvşldskjvşlkdjvşldjvldjvlkj"+
                "sjdhfkshfşksdşlkdjfşlkjdsfşlksdjsş"+
                "djgdjgşdjgldjgldjfvldjşvljdlvkjdvj";

        String not="not";
        String Not="variable isimlerinin büyük harf ile baslaması tavsiye edilmez ama java kabul eder";
        String nOT="Bir kere deklare edilen variable tekrar deklare edilemez";
        String noT="ama isimler farklı şekilde yazıldıgı için java bunları farklı variable olarak kabul eder";

        // camelCase: küçük harfle baslar, sonraki kelimeler bitisik yazılır ve ilk harfi büyük olur
        //ilkHarf, ögrenciNo, okulDefteriDolabı
        //naming convention (isimlendirme geleneği)


    }




}
