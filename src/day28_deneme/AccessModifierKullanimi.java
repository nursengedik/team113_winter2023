package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {

    public static void main(String[] args) {
        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();//class üyesine ulaşabiliyorsak read ve write yapabiliriz
        System.out.println(obj.a); // read yetkisi
        obj.a = 100; // write yetkisi

        // System.out.println(obj.satisTutari); //yazdırma= read yetkisi, oradaki bilgiyi görebilmek
                                               // satısTutarı static oladığı için obje üzerinden çağrılıyor

        // obj.satisTutari = 100; //değer atama= write yetkisi


        /*
            Baska bir classdaki variable veya method'a ulasmak istedigimizde
            - ulasmak istedigimiz class uyesinin static olup olmamasi
              erisim yontemini etkiler

              static ise calssIsmi.uyeIsmi yazarken
              static degilse obje olusturup objeIsmi.uyeIsmi

            - ulasmak istedigimiz uyenin access modifier'i ise
              o uyeye ulasip ulasamayacagimizi belirler

              ulasabilirsek o datayi okuyabilir veya o dataya yeni deger atayabiliriz
         */
    }


}
