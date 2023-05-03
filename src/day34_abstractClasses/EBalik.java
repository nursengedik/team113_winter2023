package day34_abstractClasses;

public abstract class EBalik extends AHayvan{//balık classını abstract yapmalıyız çünkü balık diye bir obje yok

    //CONCRETE= abstract olmayan
    public void hareket(){//CONCRETE edilir, çünkü balıklar için ortak bir özellikse alt classlar(child classlar)
                         //oluşturulduğunda tekrarda bu methodu yazmamak için, bir kere concrete edilir (ekran g89)
                        //yapılmazsa alt calsslarda implement edilmek zorunda kalınacak
        System.out.println("Baliklar yuzer");
    }

    public void solunum(){
        System.out.println("Baliklar solungac solunumu yapar");
    }

    public void cogalma(){
        System.out.println("Baliklar yumurta ile cogalir");//buraya kadar hayvan classı kural koydu
    }

    public abstract void yuzgec();//bu methodlar ile balık classı kural koyacak
    public abstract void yasamAlani();
    public abstract void iskeletYapisi();

}