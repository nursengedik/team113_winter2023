package day24_staticKeyword;

public class C02_PassByValue {

    public static void main(String[] args) {


        double fiyat = 200;

        /*
        int fiyat=500;
        String fiyat = "Java pass by value kullanir";

        Java ayni method icerisinde ayni isimde
        birden fazla variable olusturulmasina IZIN VERMEZ
         */
        indirimYap10(fiyat);//methodda 180 ama
        System.out.println("method call'dan sonra fiyat : "+fiyat);//200
        indirimYap25(fiyat);//methodda 150 ama
        System.out.println("2.method call'dan sonra fiyat : "+fiyat);//200
        System.out.println("Return yapilan method'dan donen fiyat : "+indirimliFiyatGetir10(fiyat));//180 ama
        System.out.println("3.method call'dan sonra fiyat : "+fiyat);//200
         //main methoddaki fiyat methodda yapılan değişikliklerle,atamalarla değişmez
        // main method'daki fiyati kalici olarak degistirmek istersek
        // main method icerisinde atama yapmaliyiz

        fiyat= indirimliFiyatGetir10(fiyat);//methoddaki sonuç main method da atama yapılıyor
        System.out.println("main method'da atama yapildiktan sonra fiyat : "+fiyat);//180

    }

    public static void indirimYap10(double fiyat){ //double fiyat = degeri methodun cagrildigi yerden gelir
                                                  //herbirinin scop u kendi methodu içerisindedir
        fiyat= fiyat * 0.9 ;
        System.out.println("%10 indirimli fiyat : " + fiyat);//180- bu method main method içerisinden çağrıldığında
                                                             //satır 17-18 methoddaki sonucu yazdırmaz main method
                                                           //içerisindeki karşılığını yazdırır(PassByValue)
    }

    public static void indirimYap25(double fiyat){
        fiyat= fiyat * 0.75 ;
        System.out.println("%25 indirimli fiyat : " + fiyat);//150
    }

    public static double indirimliFiyatGetir10(double fiyat){
        fiyat = fiyat * 0.9 ;

        return fiyat;//180
    }
}
