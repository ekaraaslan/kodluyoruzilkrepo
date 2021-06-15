package deneme;
import java.util.Scanner;
public class Basamaksayilaritoplami {
    public static void main(String[] args) {
        int sayi;
        int bastop=0;
        Scanner giris=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        sayi = giris.nextInt();
        while (sayi != 0){
            //System.out.println(sayi%10);
            bastop += sayi%10;
            sayi /= 10;
        }
        System.out.println("Basamak Sayılarının Toplamı : " + bastop);
    }
}
