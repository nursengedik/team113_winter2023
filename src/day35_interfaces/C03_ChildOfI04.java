package day35_interfaces;

public class C03_ChildOfI04 implements I04_InterfaceIstisnalar{


    @Override
    public void toplama() {//bir interfaces i implement ettiğimiz zaman bütün methodları zorlar hepsine sahip olalısın
                          //yani çağırmalısın ama burada I04_InterfaceIstisnalar daki ekIsler ve acıklama methodları
                         //için zorlamadı çünkü static ve default olduğu için yani istisnai durum, peki nasıl ulaşıriz satır 16

    }


    public static void main(String[] args) {

        //istisna methodlara nasıl ulaşılır

        C03_ChildOfI04 obj = new C03_ChildOfI04();
        obj.ekIsler(); // Default keyword ile body'si olan method olusturulabilir
                      //default olana obje ile ulaşabiliriz

        I04_InterfaceIstisnalar.aciklama(); // Bu method'u implement etmek mecburi degil
                                           //static olana interfaces ismi ile ulaşabiliriz
    }
}