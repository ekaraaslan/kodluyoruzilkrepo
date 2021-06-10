package deneme;
import java.util.Scanner;
public class dersgecme {
    public static void main(String[] args) {
        int mat,fiz,kim,biyo,turk;
        Scanner input = new Scanner(System.in);

        System.out.print("Matemetik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kim = input.nextInt();
        System.out.print("Biyoloji Notunuz : ");
        biyo = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turk = input.nextInt();
        double avarge = ( mat + fiz + kim + biyo + turk ) / 5 ;
        if (avarge <= 55 ){
            System.out.println("Sınıfta kaldınız, Bütünlemede görüşmek üzere...");
        }
        else{
            System.out.println("Tebrikler, sınıfı geçtiniz...");
        }
        System.out.println("Ortalamanız : " + avarge);
    }
}
