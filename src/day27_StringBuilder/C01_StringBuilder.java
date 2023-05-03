package day27_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0 -içi boş olduğu için 0

        sb1.append("Mustafa");//StringBuilde'e append ile ekleme yaptık

        System.out.println(sb1.capacity()); // 16 -eklenecek stringin uzunluğu 16'nın içine sığdığı için
        System.out.println(sb1.length()); // 7    -kapasiteyi arttırmaz, 16+7=23 vermez, obje oluşturulmuşsa
                                                //-kapasiteyi arttırır, 2 yöntem satır 28

        sb1.append(" Yilmazturk");
        System.out.println(sb1.length()); // Mustafa Yılmazturk 18 karakter
        System.out.println(sb1.capacity()); // 34 = 2 * eski capacity + 2
        System.out.println(sb1.length()); // 18

        sb1.append(" javayi cok sever, sabah aksam Java calisir.");
        System.out.println(sb1.capacity()); // 70 = 2 * 34 + 2
        System.out.println(sb1.length()); // 62


        // 2.yontem
        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2.capacity()); // 27 ====>16 objeden geliyor 16+11=27
        System.out.println(sb2.length()); // 11


        // 3.yontem

        StringBuilder sb3 = new StringBuilder(11);
        sb3.append("54464473321");
        System.out.println(sb3.capacity()); // 11
        System.out.println(sb3.length()); // 11

        sb3.append(" : Tc No");
        System.out.println(sb3); // 54464473321 : Tc No
        System.out.println(sb3.capacity()); // 11 * 2 + 2 = 24
        System.out.println(sb3.length()); // 19

        String str = "Java Candir";

        sb3.append(str,4,str.length());//string içinden bir parça alıp (str'nin 4 index inden sonuna kadar al)
                                           // string buildere ekleyebiliriz

        System.out.println(sb3); // 54464473321 : Tc No Candir

        // trim :fazla kapasiteyi kaldırır

        sb3.trimToSize();
        System.out.println(sb3.capacity()); // 26
        System.out.println(sb3.length()); // 26




    }
}
