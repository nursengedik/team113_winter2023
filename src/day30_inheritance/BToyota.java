package day30_inheritance;

public class BToyota extends Araba{//BToyota Araba class ındaki tüm özelliklere ship olmalıdır ve bunu
                                  //extends ile yaparız ,extends keyword ü ile Araba class ının tüm
                                 // özelliklerini sahiplendiririz

    //sonra şöyle düşünürüz, bu özellikleri olduğu gibi koruyalım mı, kendimize göre uyarlayalım mı
    //(güncelleyelim mi), yeni özellikler ekleyelim mi ?

    //model, vites ve üretim yerini özelleştiremeyiz, çünkü toyotanın altında birçok model olabilir

    String marka = "Toyota";//bazı özellikleri özelleştirdik
    String aku = "Inci aku";//özellik ekledik
    String lastik = "Bridgestone";//özellik ekleyerek özelleştirdik

    public void motor(){//özelleştirdik

        System.out.println("Toyotalar cevreci toyota motorlar kullanir");
    }

    public void guvenlik(){//özellik ekledik özelleştirdik

        System.out.println("Toyota araclar extra guvenlik onlemleri barindirir");
    }


}