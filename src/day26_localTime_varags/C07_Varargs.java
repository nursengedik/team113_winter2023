package day26_localTime_varags;

public class C07_Varargs {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayip yazdiran bir method olusturun

        topla(3,6); // 9
        topla(3,4,5); // 12 - 2. methodda çalışır
        topla(1,2,3,4); // 10 - 3. methodda çalışır

        //toplanacak sayı adedi arttıkça method oluşturmak gerekecek, kolay yolu C08 class ında

    }

    public static void topla(int a , int b){

        System.out.println(a+b);
    }

    public static void topla(int a , int b,int c){

        System.out.println(a+b+c);
    }

    public static void topla(int a , int b,int c,int d){

        System.out.println(a+b+c+d);
    }
}