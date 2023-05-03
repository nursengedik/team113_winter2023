package day28_deneme;

import day28_accessModifier_encapsulation.C01;

public class deneme {

    public static void main(String[] args) {

        C01 obj = new C01();

        //str instance variable olduğu için str ye obje üzerinden ulaşabiliriz ama buarada ulaşılamıyor
        // obj.str = "Fava";  farkli package default access modifier olduğu için

        // s static olduğu için class isminden ulaşılabilir ama burada ulaşılamıyor
        //C01.s="Fava";//farklı package- default access modifier başka package den kullanılamaz
        // obj.b=10; private access modifier olduğu için başka package den kullanılamaz

        // C01.c= 30;  private access modifier olduğu için başka package den kullanılamaz

        obj.d = 50;
        C01.a = 30;
    }
}