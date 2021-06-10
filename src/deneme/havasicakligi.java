package deneme;
import java.util.Scanner;
public class havasicakligi {
    public static void main(String[] args) {
        int Sicaklik;
        Scanner Giris = new Scanner(System.in);
        System.out.print("LÜtfen Sıcaklıığı Giriniz : ");
        Sicaklik= Giris.nextInt();
        if (Sicaklik<=5){
            System.out.println("Bugün Kayak Yapılabilir."); }
        if (Sicaklik>=5 && Sicaklik<=15){
            System.out.println("Bugün Sinemaya Gidilebilir."); }
        if (Sicaklik>=10 && Sicaklik<=25){
            System.out.println("Bugün Piknik Yapılabilir."); }
        if (Sicaklik>=25){
            System.out.println("Bugün Yüzme Yapılabilir."); }
    }
}
