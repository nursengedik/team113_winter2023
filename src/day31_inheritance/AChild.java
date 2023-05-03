package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent {

    String childStr;//variable

    AChild(){//3
             //bir class ta extends keyword varsa her constructor ın ilk satırında biz görmesek bile gizli bir
            //super (); constructor call vardır
    //4- super (); bu ne demektir, Parent class taki parametresiz constructor ı çağır çalıştır demektir
    //5-day30_parent e gider ve parametresiz constructor ı çalıştırır, orada da extends varsa super ();
        // çalışır ve day30 daki GrandParent e gider ve parametresiz constructor ı çalıştırır

        System.out.println("Child class constructor calisti");
    }

    public static void main(String[] args) { //1

         //bir variable la ulaşabilmek için sadece access modifier ine bakmak yeterli olmaz static
        //olup olmadığına da bakmamız gerekir

        // System.out.println(childStr); static degil
        // System.out.println(sayiParent); static degil (day 30 daki)
        // System.out.println(sayiGrandparent); static degil (day 30 daki) ulaşabilmek için obje oluştururuz

        AChild objeChild = new AChild();//2
                                       //parametresiz olduğu için 9.satırdaki parametresiz constructor çalışacak


        /*
            Java'da inheritance kullanirken
            child class'daki obje parent class(lar)'daki tum ozelliklere sahip olur
            bunu saglayan Java mekanizmasi super() constructor call'dur.

            Extends keyword kullanan bir class'da
            olusturulan her bir constructor'in ilk satirinda
            biz gormesek bile super() vardir
            super() ==> once parent class'a gidip oradaki parametresiz constructor'i calistir demektir

            bu sekilde child class'daki constructor calistiginda
            extends keyword kullanmayan parent buluncaya kadar
            parent class'lara gider.
         */


    }


}