package day42_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        Queue<String> harfler=new LinkedList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("A");

        System.out.println(harfler);

        //2.indexe D ekleyelim
        //Queue özelliğinden dolayı her zaman sadece sona ekler, 2. index e ekleme yapamayız


        System.out.println(harfler.remove());//remove() içi boş olunca ilk harfi siler ve sildiği elemanı yazdırır
                                            //A
        System.out.println(harfler);//[B, C, A]
        harfler.remove();//silme yapar ama yazdırmadığımız için sonuç göremeyiz
        System.out.println(harfler);//[C, A]
        harfler.add("K");
        harfler.add("L");

        System.out.println(harfler.element());//ilk elemanı yazdırır, içi boş ise exceptions fırlatır
        System.out.println(harfler);
        System.out.println(harfler.peek());
        System.out.println(harfler);

        Queue<String> karakterler =new LinkedList<>();

        System.out.println(karakterler.peek()); //bu method da ilk harfi yazdırır, içi boş ise null değer verir
        // System.out.println(karakterler.element()); //exception NoSuchElementException fırlatır

        System.out.println(harfler.poll());//ilk karakteri silerek kalanları yazdırır, içi boş ise null yazdırır
        System.out.println(harfler);//[A, K, L]
        System.out.println(karakterler.poll()); //null

        System.out.println(karakterler.offer("*"));
        System.out.println(karakterler); //[*]

    }

}
