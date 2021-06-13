package deneme;
import java.util.Scanner;
public class uslusayilar {
    public static void main(String[] args) {
        int n,k;
        Scanner giris=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = giris.nextInt();
        System.out.print("Üs olarak alınacak sayıyı giriniz : ");
        k = giris.nextInt();
        int total = 1;
        int i=1;
        while (i<=k){
            total *= n;
            i++;
        }
        System.out.println("Cevap : " + total);
    }
}
