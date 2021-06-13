package deneme;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 ..... * n
        int sayi,faktor=1;
        Scanner giris = new Scanner(System.in);
        System.out.print("Faktoriyel Sayısını Giriniz : ");
        sayi = giris.nextInt();
        for (int x=1;x<=sayi;x++){
            faktor=faktor*x;
        }
        System.out.println(sayi + " Faktoriyel = " + faktor);
    }
}
