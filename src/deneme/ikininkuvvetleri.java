package deneme;
    import java.util.Scanner;
public class ikininkuvvetleri {
    public static void main(String[] args) {
        int sayi;
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz : ");
        sayi=giris.nextInt();
        for (int x = 1;x<sayi;x++){
            if (x%2==0){
                System.out.print("\t" + x + "²: " + (x*x) + "\n");
            }
        }
    }
}
