package deneme;
import java.util.Scanner;
public class hesapmak {
    public static void main(String[] args) {
        int n1, n2, secim;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz : ");
        secim = input.nextInt();
        if (secim == 1){
            System.out.println("Toplam : " + (n1 + n2));
        }
        if (secim == 2){
            System.out.println("Fark : " + (n1 - n2));
        }
        if (secim == 3){
            System.out.println("Çarpım : " + (n1 * n2));
        }
        if (secim == 4){
            System.out.println("Bölüm : " + (n1 / n2));
        }
    }
}
