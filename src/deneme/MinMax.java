package deneme;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int ss,maks=0,min=0;
        int[] sayi;
        Scanner giris=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        ss = giris.nextInt();
        sayi = new int[ss];
        for (int x=0;x<=(ss-1);x++){
            System.out.print((x+1) + ". Sayıyı Giriniz : ");
            sayi[x]= giris.nextInt();
        }
        maks = sayi[0];
        min = sayi[0];
        for (int x=0;x<=(ss-1);x++){
            if (sayi[x]>=maks){
                maks = sayi[x];
            }
            if (sayi[x]<=min){
                min = sayi[x];
            }
        }
        System.out.println("En Büyük Sayı : " + maks);
        System.out.println("En Küçük Sayı : " + min);
    }
}
