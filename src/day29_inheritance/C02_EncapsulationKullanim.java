package day29_inheritance;

public class C02_EncapsulationKullanim {

    public static void main(String[] args) {

        C01 obj = new C01();//C01 deki isim variable si statik olmadığı yani instance olduğu için başka class tan
                           //obje oluşturularak çağrılabilir

        obj.isim="Melike"; // write yetkisi
        System.out.println(obj.isim); // read yetkisi


        obj.setSayi(40); // write - burada atama yapıldı
        System.out.println(obj.getSayi()); // 40 read - burada sadece bilgi alındı

        /*
            bir class uyesinin public olmasi ile
            private yapilip, getter ve setter method'larinin olusturulmasi
            islevsel acidan ayni sonucu olusturur

            Bazi developer'lar set(write) ve get(read) yekilerinin
            kullanildigini vurgulamak icin
            2.yontemi tercih ederler.(private yapıp daha sonra get ve set yetkisi verme)
         */
    }
}
