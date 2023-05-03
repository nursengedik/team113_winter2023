package day02_dataTürleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //1. adım: Scanner objesini oluşturun
        Scanner scan = new Scanner(System.in);

        //2. adım: Kullanıcıya ne istediğinizi söyleyin
        System.out.println("Lütfen ismininzi giriniz");

        //3. adım: girilen bilgiyi içine koyabileceğiniz bir variable oluşturun
        //         oluşturduğunuz scanner objesi ile uygun method'u kullanarak bilgiyi alın

        String kullanıcıIsmi= scan.next();

        System.out.println("Girilen isim:"+ kullanıcıIsmi);


    }
}
