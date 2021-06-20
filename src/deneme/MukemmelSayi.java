package deneme;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        //Bir sayının kendisi hariç, pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı,
        // kendisine eşit olan sayıya MÜKEMMEL SAYI denir.
        // (2^p)-1 asal sayı verir
        // (2^(p-1))*((2^p)-1) Mükemmel çift sayı verir.
        int sayi,kbst=0;
        Scanner giris=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = giris.nextInt();
        for (int x=1;x<sayi;x++){
            if (sayi%x==0) {
                kbst += x;
            }
        }
        if (sayi==kbst){
            System.out.println(sayi + " Sayısı Mükemmel Bir Sayıdır...");
        }else {
            System.out.println(sayi + " Sayısı Mükemmel Sayı Değildir...");
        }
    }
}
