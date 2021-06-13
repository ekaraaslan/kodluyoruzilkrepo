package deneme;
import java.util.Scanner;
public class sayilarinkuvvetleri  {
    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz : ");
        sayi=giris.nextInt();
        for (int x = 1;x<sayi;x++){
            System.out.print("\t" + x + "²: " + (x*x) + "\n");
        }
    }
}
