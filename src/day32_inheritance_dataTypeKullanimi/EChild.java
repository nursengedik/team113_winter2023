package day32_inheritance_dataTypeKullanimi;

public class EChild  extends DParent{

    String str = "Child";

    void method1(){//7. satırın yanındaki işaret child clasındaki method1 DParent classtaki method1 i geçersiz kıldı
        System.out.println("Child method 1");
    }

    /* Override : gecersiz kilma
       Overridden : gecersiz kilinan
     */

    public static void main(String[] args) {

        EChild childC = new EChild();//child classından obje oluşturuldu
        childC.method1(); // Child method 1
                         // methodda da data türü EChild ile constructor EChild() aynı olduğu için bulunduğu
                        //class a bakar ve onu yazdırır
        System.out.println(childC.str); // Child

        DParent childP = new EChild();//variable olarak oluşturulmuş, data türü DParentmolduğu için oradaki
                                     // değeri yazdırır

        System.out.println(childP.str); // Parent

        childP.method1(); // Child method 1
                         // DParent data türü ve EChild() constructor farklı olduğu için DParent class ına bakar
                        //ve oradaki method1 in geçersiz olduğunu görürve çalıştırmaz ve bu methodu geçersiz
                       //kılan methoda child class ına gider ve oradaki methodu yazdırır

        //ortak özellikleri yazdırırken method kullanmışsak bulunulan projede en güncel olanı yazdırır
    }
}