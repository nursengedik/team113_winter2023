package day29_inheritance;

public class C01 {


    public String isim;

    private int sayi;//başka classlar ulaşamaz

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    private boolean happy;

    public int getSayi() {
        return sayi;
    }//okuma yetkisi verildi

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }// yazma yetkisi verildi
}
