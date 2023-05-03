package day24_staticKeyword;

public class C01_staticBlocks {
    C01_staticBlocks(){//bu bir constructor dır
        System.out.println("Constructor calisti");
    }


    public static void main(String[] args) {

        System.out.println("Main method calisti");

        System.out.println("======");
        C01_staticBlocks obj1= new C01_staticBlocks();//hiçbir variable ve method yokken de obje oluşturduğumuzda
                                                     //static olmayan blok çalışır, satır 33, class da constructors
                                                    //olsa bile
    }

    static {  //static blok
        /*
            static block'lar class ilk calismaya basladiginda calisir
            genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir
            birden fazla static block varsa
            yukaridan asagi dogru sirali olarak calisir
         */
        System.out.println("static block calisti");
    }

    static {
        System.out.println("Altdaki static block calisti");
    }

    {  //static olmayan blok
        /*
            static olmayan block'lar ise obje olusturulurken
            constructor'dan once calisir
            obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilir
         */
        System.out.println("static olmayan blok calisti.");
    }
}

