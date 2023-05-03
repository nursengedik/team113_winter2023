package day35_interfaces;

public interface I04_InterfaceIstisnalar {

    void toplama();//interfaces methodlar abstract olduğu için body leri yoktur, olmasını istiyorsak

    static void aciklama(){//body sinin olmasını istiyorsak yanına static veye default yazmalıyız (istisnai durum)
        System.out.println("Bu method'u implement etmek mecburi degil");
    }

    default void ekIsler(){
        System.out.println("Default keyword ile body'si olan method olusturulabilir");
    }
}
