package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C03_Compute {
    public static void main(String[] args) {

        // verilen bir String array'de her bir harfin kacar defa kullanildigini yazdirin
        // Ornek : String[] arr = {"A","C","B","N","A","N","A"}
        //               Output : A=3, B=1, C=1, N=2

        String[] arr = {"A","C","B","N","A","N","A"};


        Map<String,Integer> kullanimMiktarlari = new TreeMap<>();//TreeMap elemanları sıralı verir, küçükten
                                                                 //büyüğe doğru
        //1- contains() kullanarak yapalim

        // arr'deki her bir elementi ele alalim

        for (String each : arr
        ) {

            // eger ele aldigim element map'de yoksa
            // map'e element, 1 eklerim (yani map de A yoksa map e A=1 eklerim)

            if (!kullanimMiktarlari.containsKey(each)){//map bu elementi içermiyorsa,yoksa demektir
                kullanimMiktarlari.put(each,1);//else oluşturmadan yazdırırsak {A=1, B=1, C=1, N=1}
            }else{
                // eger o element daha once map'de varsa
                // o zaman value'yu 1 artirmamiz lazim (yani A=2 ... olur)

                int elementinEskiKullanimMiktari= kullanimMiktarlari.get(each);//eski miktarlarını aldık
                kullanimMiktarlari.put(each, elementinEskiKullanimMiktari+1);//A nın değerini 2 yapma
            }
        }

        System.out.println(kullanimMiktarlari);


        //2- compute (kompüt) method'lari kullanarak da yapabiliriz

        Map<String,Integer> kullanim2 = new TreeMap<>();

        for (String eachHarf: arr
        ) {

            //varsa 1 arttıracak yoksa ekleyecek

            // eger o element daha once map'de varsa
            // o zaman value'yu 1 artirmamiz lazim

            kullanim2.computeIfPresent(eachHarf,(k,v) -> v+1);//computeIfPresent varsa demektir
            //ne varsa? eachHarf i kontrol edecek, map imiz k ve v oluşur ve value yi 1 arttır demektir

            // eger ele aldigim element map'de yoksa
            // map'e element, 1 eklerim

            kullanim2.putIfAbsent(eachHarf,1);//putIfAbsent eğer yoksa demektir (eachHarf,1) koy
        }

        System.out.println(kullanim2);
    }
}