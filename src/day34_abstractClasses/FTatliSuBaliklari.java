package day34_abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class FTatliSuBaliklari extends EBalik{

    @Override
    public void beslenme() {//balık classında implement edilmediği için burada implement edilmek zorundadır
                          //nasıl?public class FTatliSuBaliklari extends EBalik, FTatliSuBaliklari nın yanına
                         //gelerek tıklanır ve seçimler yapılır implement edilen methodlar hazır halde gelir(eg90-91)

    }

    @Override
    public void omur() {

    }

    @Override
    public void yuzgec() {

    }

    @Override
    public void yasamAlani() {

    }

    @Override
    public void iskeletYapisi() {

    }

    public static void main(String[] args) {

        // AHayvan hayvan = new AHayvan();//AHayvan abstract class olduğu için abstract classtan obje oluşturulmaz
        // EBalik balik = new EBalik();//abstract class

        FTatliSuBaliklari sazan = new FTatliSuBaliklari();//concrete class olduğu için obje oluşturulabilir

        EBalik alabalik = new FTatliSuBaliklari();

        AHayvan yayin = new FTatliSuBaliklari();

        /*
            Abstract class'larin constructorlari vardir
            ama obje olusturulamaz

            Abstract classlar data turu secilip
            concrete child class'larin constructor'lari kullanilarak
            Abstract parent class ozelliklerinde objeler olusturulabilir (satır 42-44)
         */

        List<String> liste = new ArrayList<>();//list abstract, concrete olan arraylist child calsssının concructorunu
                                              //kullanarak üzerinden obje oluşturulabilir
    }
}
