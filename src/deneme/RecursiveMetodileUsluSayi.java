package deneme;
import java.util.Scanner;
public class RecursiveMetodileUsluSayi {
    public static void main(String[] args) {
        int taban,us,total=1;
        Scanner giris=new Scanner(System.in);
        System.out.print("Taban degerini giriniz : ");
        taban = giris.nextInt();
        System.out.print("Üs degerini giriniz : ");
        us = giris.nextInt();
        System.out.println(power(taban,us));
    }
    static int power(int taban,int us){
        if (us==1){
            return taban;
        }
        return taban * power(taban,us-1);
    }
}
