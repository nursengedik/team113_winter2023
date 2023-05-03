package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {//child class

    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";


    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();
        System.out.println(kartalAvci.hareket);// C ucarlar
        System.out.println(kartalAvci.beslenme);// C et yerler
        System.out.println(kartalAvci.pence);// C pencelidir
        System.out.println(kartalAvci.gaga);// C sivri gagali

        System.out.println(kartalAvci.kanat);// B class ından kanatlidir
        System.out.println(kartalAvci.solunum);// B akciger
        System.out.println(kartalAvci.cogalma);// B yumurtayla

        System.out.println(kartalAvci.omur); // A class ından yasar ve olurler

        BKuslar kartalKus= new CAvciKuslar();//BKuslar class ından obje oluşturmuyoruz
                                            //kuşlar class ındaki kartaldan bahsediyoruz
                                           //kuş olan kartalın özelliklerini verir
                                          // BKuslar classına ve parenti olan AHayvanlar classına bakılır

        System.out.println(kartalKus.hareket);// A hareket ederler- C classından hiçbir özellik yok
        System.out.println(kartalKus.beslenme);// A beslenirler
        //System.out.println(kartalKus.pence);// CTE
        System.out.println(kartalKus.gaga);// B gagalari vardir

        System.out.println(kartalKus.kanat);// B kanatlidir
        System.out.println(kartalKus.solunum);// B akcigerlr nefes alır
        System.out.println(kartalKus.cogalma);// B yumurtayla

        System.out.println(kartalKus.omur); // A yasar ve olurler


        AHayvanlar kartalHayvan= new CAvciKuslar();//burada da hayvan olan kartalın özelliklerine bakarız
                                                  //hayvan classındaki kartalın özelliklerini verir
        System.out.println(kartalHayvan.hareket);// A hareket ederler
        System.out.println(kartalHayvan.beslenme);// A beslenirler
        //System.out.println(kartalHayvan.pence);// CTE
        //System.out.println(kartalHayvan.gaga);// CTE

        //System.out.println(kartalHayvan.kanat);// CTE
        System.out.println(kartalHayvan.solunum);// A nefes alirlar
        System.out.println(kartalHayvan.cogalma);// A cogalirlar

        System.out.println(kartalHayvan.omur); // A yasar ve olurler


        // Variable olarak ozellikleri olusturursak

        BKuslar kuslar= new BKuslar();
        BKuslar avciKuslar= new CAvciKuslar();
        // bu iki obje arasinda bir fark goremeyiz, çünkü data türüne göre BKuslar classındaki ve parentindeki
        //özellikleri verir

        /*
            Eger bir obje olusturulurken     -  CAvciKuslar avciKuslar= new CAvciKuslar();
            Data turu ve constructor ayni ise
            aradigimiz ozellikler icin direk o class'a gider
            ve ozellikleri arariz

            Eger data turu ve constructor farkli ise  -  BKuslar kartalKus= new CAvciKuslar();
            variable ve method'lar farkli davranirlar

            BKuslar kartalKus= new CAvciKuslar()
            BKuslar :data türü,  kartalKus= : variable,  CAvciKuslar(): consructor

            variable'lar    kartalKus=   (özellikleri variable olarak belirlemişsek)
            - once data turunun oldugu class'a bakar
              o variable'i bulursa degerini yazdirir
              bulamazsa data turunun parent'larina bakar
              orada bulursa degerini yazdirir
              orada da bulamazsa CTE verir

              Ozetle bir ozelligi variable olarak olusturursaniz
              data turu olan class ve parentlarindaki ortak ozelliklere bakar
              ortak bilgileri arar,
              en guncel bilgiyi aramaz
         */

         //eğer ortak özellikleri vermesini istiyorsak , özellikleri variable olarak oluşturmalıyız

    }


}