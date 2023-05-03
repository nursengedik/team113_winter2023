package day35_interfaces;

public interface I01_Interface {


    static int sayi = 10 ;
    final String str = "Java Candir";
    public static final boolean b = true;

    // Interface'de tum variable'lar (Yazilmasa bile) public, static ve final'dir
    // final oldugu icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir
    // bu ozellikler standart olarak tum variable'lara tanimlandigindan,
    // bu tanimlamalari yapmak gerekli degildir (intelliJ gri yapti)


    void toplama();//interfaces bir methoddur,interfaces ler abstract methodlardan oluşur  methodun yanında
                  // abstract yazmasa da abstractır,concrete değildir çünkü concrete methodların body si vardır
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    // tum method'lar da standart olarak public ve abstract'tir (yazilmasa bile)

}
