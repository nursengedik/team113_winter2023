package day28_accessModifier_encapsulation;

public class C02 {

    public static void main(String[] args) {

        C01 obj = new C01();
        // System.out.println(obj.b); //static olsa da olmasa da access modifier private olduğu için bu class tan
                                     //kullanılamaz, bu class ta obje oluşturulsa dahi
        // System.out.println(C01.c); access modifier private olduğu için


        obj.str = "tava";
        C01.s="Tava";

        C01.a = 50;//public static olduğu için başka packageden class ismiyle kullanılır
        obj.d=40;//static olmadığı için obje üzerinden ulaşılabilir

    }
}
