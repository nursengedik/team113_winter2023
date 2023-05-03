package day02_dataTürleri_Scanner;

public class C02_DataTurlerı {

    public static void main(String[] args) {

        char ilk='8';// Tek tırnak içinde tek karakter (harf, sayı, özel karakter)

        byte ogrYası1=15;// en dogru kullanım bu olur, hafıza kullanımını optimize etmek için bu yeterlidir
        short ogrYası2=16;
        int ogrYası3=14;
        long ogrYası4=15;

        double sayı1=3.1234567898123453789;
        System.out.println(sayı1);//3.1234567898123453

        //Double virgülden sonra 16 hane yazdırır, ama cok kücük sayılara indigi için
        //ondalıklı kısmın sonunda hatalar olabilir
        //15/3=4.999999999999999    5.0   5.0000000000000000

        float sayı2=45.543334578465354648f;
        //float sayı tanımlandıgında double'dan farklı oldugunu belirtmek için
        //sonuna f veya F yazmak zorundayız
        System.out.println(sayı2);//45.543335


        //Biz dersler boyunca hafıza önemli olmadıgı için
        //tamsayılar için int, ondalıklı sayılar için de double kullanırız




    }
}
