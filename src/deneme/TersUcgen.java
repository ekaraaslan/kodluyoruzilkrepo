package deneme;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int sayi;
        Scanner giris=new Scanner(System.in);
        System.out.print("Lütfen Üçgenin Basamak Sayısını Giriniz : ");
        sayi = giris.nextInt();
        for (int x=sayi;x>=1;x--){
            for (int y = 0;y < (sayi-x) ; y++){
                System.out.print(" ");
            }
            for (int z = 0;z < ((2*x)-1) ; z++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
