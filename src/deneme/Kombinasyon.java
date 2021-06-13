package deneme;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 ..... * n
        // C(n,r) = n! / (r!*(n-r)!)
        long n,r,nF=1,rF=1,nrF=1;
        Scanner giris = new Scanner(System.in);
        System.out.print("Kombinasyon Sayısını Giriniz : ");
        n = giris.nextLong();
        System.out.print(n + " Sayısının Kaçıncı Kombinasyonu Hesaplanacak? : ");
        r = giris.nextLong();
        for (int x=1;x<=n;x++){
            nF=nF*x;
        }
        for (int x=1;x<=r;x++){
            rF=rF*x;
        }
        for (int x=1;x<=(n-r);x++){
            nrF=nrF*x;
        }
        System.out.println(n + " Sayısının " + r + ". Kombinasyonu : " + nF / (rF * nrF));
    }
}
