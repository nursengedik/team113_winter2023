package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExceptions {
    public static void main(String[] args) {

        String dosyaYolu = "src/day36_exceptions/text.txt";


        FileInputStream fis = null;
        try {

            fis = new FileInputStream(dosyaYolu);//burada dosya bulunamazsa hatası var
            int k=0;                          //read altı çizili hata veriyor
            while((k= fis.read() ) != (-1)) {//burada, dosyayı buldum ya okunamazsa hatası var
                System.out.print((char) k); //fis söylenen dosyaya gidip ilk karakteri alıyor boş değilse yazdırıyor
            }                              //boş ise yani harf bulamazsa -1 döndürüyor
                                          //while k= fis.read() -1 olmadığı müddetçe karakteri yazdır
        } catch (FileNotFoundException e) {//child


        } catch (IOException e) {//parent


        }

        /*
            Eger kodumuzda birden fazla exception ihtimali varsa
            ve bu exception'lar arasinda parent-child iliskisi varsa

            1- Ya sadece parent'i yazariz
               cunku parent exception, child exception'lari da kapsar

            2- Veya ikisini de yazmak istiyorsak
               once child exception'i
               sonra parent exception'i yazmaliyiz
         */


    }
}
