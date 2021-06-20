package deneme;
import java.util.Scanner;
public class okek_obeb {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N1 Sayısını Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("N2 Sayısını Giriniz : ");
        int n2 = input.nextInt();
        int ks;
        if (n1<n2){
            ks=n1;
        }else{
            ks=n2;
        }
        int obeb=0;
        for (int i=1; i<=ks; i++){
            if (n1%i==0 && n2%i==0){
                obeb=i;
            }
        }
        System.out.println("OBEB : " + obeb);
        System.out.println("OKEK : " + (n1*n2)/obeb);  //OKEK = (n1*n2/OBEB)
    }
}
