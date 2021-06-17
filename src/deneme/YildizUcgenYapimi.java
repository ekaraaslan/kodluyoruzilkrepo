package deneme;
import java.util.Scanner;
public class YildizUcgenYapimi {
    public static void main(String[] args) {
        int n;
        Scanner giris=new Scanner(System.in);
        System.out.print("N Sayısını Giriniz : ");
        n = giris.nextInt();
        for (int x=1;x<=n;x++){
            for (int y=1;y<=(n-x);y++){
                System.out.print(" ");
            }
            for (int z=1;z<=(2*x-1);z++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
