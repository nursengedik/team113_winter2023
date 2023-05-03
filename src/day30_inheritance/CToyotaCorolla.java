package day30_inheritance;

public class CToyotaCorolla extends BToyota{

    String lastik="Lassa 205-55-15";//güncelledik
    String model="Corolla";//net
    String yakit="Corolla dizel,benzinli ve elektrikli olabilir";//güncelledik

    public void motor(){//corolla ya özelse güncelleriz
        System.out.println("Corolla araclar turkiye'de uretilen motor kullanir");
    }

    public void uretimYeri() {
        System.out.println("Corolla araclar Turkiye'de uretilir");//güncelledik
    }

    public static void main(String[] args) {

        CToyotaCorolla corolla=new CToyotaCorolla();//ToyotaCorolla classından obje oluşturma
        //özelliklerini yazdıralım (içinde bulunduğumuz class a bakarak)
        //en güncel olan child class dadır Araba veya Toyota class ından almaz
        //en genel özellikler parent class dadır, önce kendi class ına bakar varsa
        //class ın ismini yazdırır (Corolla )

        System.out.println(corolla.lastik); // Corolla
        System.out.println(corolla.model); // Corolla
        System.out.println(corolla.yakit); // Corolla
        corolla.motor();// Corolla - en güncel yerden alır(çünkü motor child,parent ve grand parent te de var)
        corolla.uretimYeri(); // Corolla

        System.out.println(corolla.marka);// Toyota - bu class ta yok parent tine bakarız ve ordakini kullanır
        System.out.println(corolla.aku); // Toyota - bu class ta yok parent tine bakarız ve ordakini kullanır
        corolla.guvenlik(); // Toyota

        System.out.println(corolla.vites); // Araba - grand parent ten alırız



    }
}