package day31_inheritance;

public class DCorolla extends CToyota{

    String str3="Corolla";

    DCorolla(){

        System.out.println("Parametresiz Corolla constructor'i calisti");
    }

    DCorolla(int sayi){//extends olduğu için super () constructur ı vardır, buradaki constructur parametreli
                      //olsa da super () constructur parametresiz olur
        //super(8); devalopır isterse kullanabilir ve görünebilir
        this();//bu class taki parametresiz constructor a git
        System.out.println("int Parametreli Corolla constructor'i calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1 = new DCorolla(5);
    }
}

/*
    Biz gorunur bir constructor olusturdugumuzda
    Java'nin default constructor'i silmesine benzer olarak
    Extends keyword kullanilmis bir class'daki
    herhangi bir constructor'in ilk satirinda
    gozle gorunur bir constructor call yazilmissa
    java default olarak koydugu super()'u siler

    Bir constructor'in icinde
    sadece 1 tane constructor call olabilir, this () varsa super () olmaz
    o da ilk satirda olmak zorundadir

    Eger this(parametreler) veya super(parametreler) ile
    constructor call yaptigimizda
    yazdigimiz argument ile uyumlu parametreye sahip
    bir constructor yoksa Java CTE verir
 */