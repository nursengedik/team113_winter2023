package day34_abstractClasses;

public abstract class BKuslar extends AHayvan{
    public void kanat(){

        System.out.println("kanatlidirlar");
    }

    public void solunum(){//satır numarasının yanındaki işaret şunu anlatır,kuslar clasındaki solunum methodu
                         //abstract değil ama hayvan clasındaki abstract olan solunum methodunu body leştirmiş
                        //yani implement etmiş

        System.out.println("akcigerle nefes alirlar");
    }

    public void gaga(){//absract değil, hayvan claaındaki bir methodu implement etmemiş, override edilmiş

        System.out.println("gagalari vardir");
    }

    public void cogalma(){//abstract değil ama hayvan clasındaki abstract olan çogalma methodunu body leştirmiş
                         //yani implement etmiş  (ekran g 88)
        System.out.println("yumurtayla cogalirlar");
    }
}
