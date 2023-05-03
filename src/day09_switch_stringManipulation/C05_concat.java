package day09_switch_stringManipulation;

public class C05_concat {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";
        String str3 = " ";

        // yukaridaki variablee'lari kullanarak "Java Candir" yazdirin
        // 2 şekilde yazdırabiliriz

        System.out.println(str1+str3+str2);//1-Concatenation


        System.out.println(str1.concat(str3).concat(str2)); // Java Candir
                                                           // 2- concat (birleştirme) methoduyla yapılır



    }
}
