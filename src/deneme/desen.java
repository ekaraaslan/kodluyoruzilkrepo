package deneme;
import java.util.Scanner;
public class desen {
    public static void main(String[] args) {
        int N,x;
        System.out.print("N Sayısını giriniz : ");
        Scanner giris = new Scanner(System.in);
        N = giris.nextInt();
        x=N;
        System.out.print("Çıktısı : "+x+" ");
        while (x>0){
            x-=5;
            System.out.print(x+" ");
        }
        while (x<N){
            x+=5;
            System.out.print(x+" ");
        }
    }
}
