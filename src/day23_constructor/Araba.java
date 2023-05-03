package day23_constructor;

public class Araba {

    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    @Override//toString()-Code/Generate/toString()/parametreler seçilir
    public String toString() {
        return "Araba Bilgileri :" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat ;
    }

    public Araba(int yil,String marka, String model, boolean hasarliMi, int fiyat){
        /*
        önemli
            Eger parametre ismi instance variable ismi ile AYNI DEGILSE
            bir alttdaki constructor'da oldugu gibi
            direk atama yapabiliriz
            Ancak genelde projenin daha anlasilir olmasi
            ve dogru variable'in kullanilmasi icin
            constructor'daki parametre isimleri, instance variable'lar ile ayni secilir
            Bu durumda Java'ya ayni isimdeki iki variable'dan
            hangisinin bu class'daki instance variable oldugunu belirtmemiz gerekir.
            bunun icin Java syntax olarak this. yazilmasini istemistir.

            this. yazmazsak Java en kisa sekilde ulasabilecegi variable'i bulur
            ve bir anlamı olmaz, yil = yil; , önce bulunduğumuz scope daha sonra class level e bakar
         */

        this.yil = yil;
        this.marka = marka;
        this.model = model;
        this.hasarliMi = hasarliMi;
        this.fiyat = fiyat;

    }

    public Araba(int fyt, String mrk) {//Araba constructors'nın int fyt ve String mrk parametreleri olsun
        fiyat = fyt;//yani bizim fyt olarak gönderdiğimiz parametreyi bu class daki fiyat variable na ata,
        //aynı şekilde mrk yı da marka variable na ata
        marka = mrk;//büyük projelerde variable isimleri (fyt,mrk) anlaşılmayabilir,tam anlaşılır olmalıdır
        // 21. satırda olduğu gibi

    }

    public Araba(int yil, String marka, String model, int fiyat) {
        this.yil = yil;//public Araba scop'undaki parametre olarak tanımladığım yıl variable nı
                      //Class level deki yıl variable na ata demektir,ayırt edilmesi için eşitliğin solundaki
                     //yıl ın yanına this eklenmelidir eklemezsek aynı renkte olurlar ve ayırt edilmezler
        //eşitliğin sol tarafı class leveldeki variable ı sağındaki constructors daki variable olduğunu belirtir
        //her constructors da this yazmak zorunda değiliz
        // this yazmazsak çalışmaz.yukarıda 44 ve 45 . satırlarda çalışmasının nedeni instance variable ismiyle
        //parametre isminin farklı olmasından dolayı
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;

        //bir variable ın class leveldeki instance variable olduğunu belirtmek için başına this. yazmalıyız
    }


    public Araba(){

    }

    public void yakitTuketimi(String yakitTuru){

        switch (yakitTuru){
            case "Benzin" :
                System.out.println("benzinli araclar icin yakit tuketimi: 6 l/100 km");
                break;
            case "dizel" :
                System.out.println("Dizel araclar icin yakit tuketimi: 5 l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Elektrikli araclar icin yakit tuketimi: 5 kW/100 km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }
}



