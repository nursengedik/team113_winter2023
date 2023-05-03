package day23_constructor;

public class C01_ArabaRunner {


    public static void main(String[] args) {

        Araba araba1= new Araba();//class dan obje oluşturduk,Araba class ında (C01 den önceki class)
                                 //contructors oluşturmasak bile java bir default contructors oluşturur ve
                                // değerlerini objeye atar
        System.out.println(araba1);//toString() olmadan yazdırırsak referans verir, toString Araba class ında
                                 //maus cliklenir ve Code/Generate/toString() parametreler seçilerek oluşturulur,
                                  //bu işlemi yaptıktan sonra yazdırırsak referans değil Araba bilgilerini verir
                                 //ama isimleriniyazdırır yani değer atanmamış halini
        araba1.fiyat=15000;//ya da burada olduğu gibi kendimiz de isimlere tek tek değer atayabiliriz
        araba1.marka="Volvo";

        System.out.println(araba1);//burada yazdırırsak classtaki haliyle ve değerleriyle birlikte gelir


        Araba araba2= new Araba(10000,"BMW");//Tek tek girmek yerine Araba class ında parametreli
                                                     //consuctors oluştururuz (satır 46), oluşturulan parametreyle
                                                    //argümentleri kolaylıkla girebiliriz, tek tek atama yapmak
                                                   //istemiyorsak parametreli contructors olıştururuz
        System.out.println(araba2);


    }
}
