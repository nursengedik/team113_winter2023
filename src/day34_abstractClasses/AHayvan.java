package day34_abstractClasses;

public abstract class AHayvan {

    /*
        Bir class'i abstract class yapmak icin deklarasyona
        abstract keyword'unu yazmak yeterlidir.

        Abstract class'lar class olduklari icin constructor'lari vardir
        ama abstract class'lardan obje olusturulamaz

        Abstract class'larda bugune kadar kullandigimiz yapida
        method'lar olusturabiliriz ancak bunlar child class'lar tarafindan
        uyarlanmak(override) zorunda olmaz (mecburiyet olmaz)

        Child class'lari uyarlamaya mecbur etmek istedigimiz method'lari da
        abstract yapmaliyiz

        bir method'u abstract yapmak icin
        declaration'ina abstract yazmamiz yeterlidir

        abstract = soyut demektir, bodys i olmayan
     */
    public abstract void hareket();//abstract methodların bodys i olmaz
                                  //abstract olmayan child classlar bu methodları override etmek zorundadır satır 16

    public abstract void solunum();//abstract methodlar

    public abstract void beslenme();

    public abstract void cogalma();

    public abstract void omur();
}