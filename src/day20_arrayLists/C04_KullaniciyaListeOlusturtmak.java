package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtmak {

    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda (durdurduğunda) girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(kullaniciyaListOlusturtma());//döndürülmesi istendiği için yazdırılır
    }


    public static List<String> kullaniciyaListOlusturtma(){

        List<String> isimler = new ArrayList<>();
        String girilenisim="";
        Scanner scan = new Scanner(System.in);  //for loop'la çözülmez, bittiği değer belli değil

        do {
            System.out.println("Listeye eklenmek icin bir isim girin" +
                    "\nBitirmek icin Q'ya basin");
            girilenisim = scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){         //q'yu kontrol etmemiz gerekir,çünkü
                isimler.add(girilenisim);//isimler                     //ilk isimde q kullanabilir ve isimleri
            }                           //List'ine                    //yazmadan kod sonlanır
                                       //girilenisim'leri ekle demek
        }while(!girilenisim.equalsIgnoreCase("Q"));//girilenisim q'ya eşeit olmadığı
                                                             //müddetçe çalış demektir
        return isimler;


    }
}