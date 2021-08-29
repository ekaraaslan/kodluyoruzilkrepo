package deneme;
import java.util.Scanner;
public class RecursiveAsal {
    public static void main(String[] args) {
        int sayi,sonuc;
        Scanner giris=new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        sayi = giris.nextInt();
        sonuc = asalsayi(sayi,sayi/2);
        if (sonuc==0){
            System.out.println(sayi + " sayısı  asal sayı değildir.");
        }
        else {
            System.out.println(sayi + " sayısı asal sayıdır.");
        }
    }
    static int asalsayi(int x, int i){
        if (x<2){
            return 0;
        }
        if (i==1){
            return 1;
        }
        if (x % i == 0){
            return 0;
        }
        return asalsayi(x,i-1);
    }
}