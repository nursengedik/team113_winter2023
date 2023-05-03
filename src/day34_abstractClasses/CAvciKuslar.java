package day34_abstractClasses;

public class CAvciKuslar extends BKuslar{

    public void hareket(){//abstract methoddudurr, implement edilmiş child classlar tarafından override edilip
                         // body li hale getirilmeye ihtiyacı var demektir
        System.out.println("ucarlar");
    }

    public void beslenme(){
        System.out.println("et yerler");
    }

    @Override
    public void omur() {
        System.out.println("Avci kuslar ortalama 10 yil yasar");//class ın yanına gelerek tıklanır ve implement
                                                               //method seçilir ve omur methodunu bodys i ile birlikte
                                                              // buraya oluşturur
    }

    public void pence(){
        System.out.println("pencelidir");
    }

    public void gaga(){
        System.out.println("sivri gagali");
    }


    public static void main(String[] args) {

        CAvciKuslar kartal= new CAvciKuslar();
        CAvciKuslar sahin = new CAvciKuslar();

        // BKuslar kus = new BKuslar();//abstract class lardan obje oluşturulmaz

        AHayvan baykus = new CAvciKuslar();//hayvan class ından başlanır
        baykus.hareket();
        baykus.solunum();
        baykus.omur();//omur methodu hayvan class ında var ama bodys i yok, mutlaka bir yerde hayvan class ının
                     //haricinde bodys i olmalıdır
                    //java, eğer sen bir methodu abstract oluşturursanonun bodys i olmadığı için ben abstract
                   //olmayan child class larını bunu override etmeye zorlarım (ekran g 87) child parent ediniyorsa
    }
}