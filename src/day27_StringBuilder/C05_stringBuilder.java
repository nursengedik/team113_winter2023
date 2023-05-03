package day27_StringBuilder;

public class C05_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.delete(4, 5)); //JavaCandir-başlangıç ve bitiş değerini verince silip kalanı veriyor

        System.out.println(sb1); // JavaCandir

        System.out.println(sb1.deleteCharAt(9)); //JavaCandi-9. index i siler

        System.out.println(sb1); // JavaCandi

        System.out.println(sb1.insert(9, "r")); // JavaCandir-9. index e r desin, yeni halini döndürür

        System.out.println(sb1); // JavaCandir

        sb1.insert(4," ");//boşluk eklendi

        System.out.println(sb1); // Java Candir

        String str = " can bize gelecekmis";

        sb1.insert(11,str,0,5);//11 index e str nin 0. dan 5. e kadar olanını al ve ekle

        System.out.println(sb1); // Java Candir can

        sb1.replace(12,15,"Can.");

        System.out.println(sb1); // Java Candir Can.

    }

}
