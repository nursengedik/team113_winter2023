package day15_doWhileLoop_scope;

public class C02_RakamlarToplamınıBulma {

    // verilen pozitif bir tamsayinin
    // rakamlar toplamini bize döndüren method olusturun


    public static int rakamlarToplaminiBul(int verilenSayi){ //56781

        int sayi=verilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int basamakSayisi= (sayi +"").length(); //5 //sayı'nın lenght() i alınmaz ama sayı stringleştirilirse
                                               //yani yanına + dersek stringleşir ve uzunluğu alınabilir

        for (int i = 1; i <=basamakSayisi ; i++) {//1 den başlayıp 5 e kadar gidecek (uzunluk dikkate alınıyor)

            birlerBasamagi= sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi /=10;
        }

        return rakamlarToplami;

    }




}
