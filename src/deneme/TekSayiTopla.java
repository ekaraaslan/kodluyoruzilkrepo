package deneme;
import java.util.Scanner;
public class TekSayiTopla {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen bir sayı griniz : ");
        sayi = giris.nextInt();
        for (int i=1;i<sayi;i++){
            if ((i%2)!=0){
                toplam=toplam+i;
            }
        }
        System.out.print("Tek Sayıların Toplam : " +toplam);
    }
}
