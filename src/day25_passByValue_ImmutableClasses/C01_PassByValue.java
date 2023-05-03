import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar); // [3, 4, 5]

        //main methoddaki sayıların referansı değişmez
        
        elementleriArtir(sayilar);//elementleri artir methodunu calistir demektir
        // elementleri artir methodunu calistirdiktan sonra
        System.out.println("element artir methodundan sonra "+ sayilar);

        yeniListeAta(sayilar);
        System.out.println("Yeni liste ata method'undan sonra : " + sayilar);
    }

    public static void elementleriArtir(List<Integer> sayilar){//list oluşturuldu
        // tum elementleri 2 katina cikaralim

        for (int i = 0; i < sayilar.size() ; i++) {

            sayilar.set(i, 2*sayilar.get(i));
        }
        System.out.println("elementleri artir methodunda :" + sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){

        // sayilar listesine yeni bir list degeri atayip
        // sonra 1,2,3 elementlerini ekleyin

        sayilar = new ArrayList<>();//yeni list oluşturulup sayılara atanır

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("Yeni liste ata methodunda : " + sayilar);//methodda non primitiv bir objeye yeni değer
                                                                    //ataması yaparsak bizim orjinal listemiz,
                                                                   //arrays'imiz değişmez

    }
}

