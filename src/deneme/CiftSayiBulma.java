package deneme;
import java.util.Scanner;
public class CiftSayiBulma {
    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen bir sayı griniz : ");
        sayi = giris.nextInt();
        for (int i=1;i<sayi;i++){
            if ((i%2)==0){
                System.out.print(i + ",");
            }
        }
    }
}
