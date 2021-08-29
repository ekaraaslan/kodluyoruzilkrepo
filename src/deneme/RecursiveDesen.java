package deneme;
import java.util.Scanner;
public class RecursiveDesen {
    public static void main(String[] args) {
     int N,M;
     Scanner giris = new Scanner(System.in);
     System.out.print("N sayısını giriniz : ");
     N = giris.nextInt();
     System.out.println(N);
     M = -5;
     desen(N,M);
     M = 5;
     desen(N,M);
    }
    static void desen(int x, int y){
        if (y==-5){
            x-=5;
            System.out.println(x);
            if (x<1) {
                return;
            }else {
                desen(x, y);
            }
        }
        else
        if (y==5){
                x+=5;
                System.out.println(x);
                if (x==30) {
                    return;
                }
                desen(x,y);
            }
        }
    }
