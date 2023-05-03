package day37_exceptions;

public class C02_ThrowKeyword {

    public static void main(String[] args) {


        String a = null;
        String b = "";

        try {
            try {
                int c = a.length() + b.length();//NullPointerException bulana kadae aradaki kodlar çalışmaz


            } catch (NullPointerException e) {//hatayı bulunca ne yapacağına bakar
                if (b.length() == 0) {//if ne yapacağını söyler
                    throw new RuntimeException();//RTE bulana kadar aradaki kodları çalıştırmadan gider
                }
                System.out.println("Null Point vardır. İşlem yapılamaz");//RTE bulamadığı için çalışmaz
            }
        }catch (RuntimeException e) {
            System.out.println("Throw Keyword Çalıştı");
        }
    }
}
