package deneme;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean sonuc=false;
        Scanner giris=new Scanner(System.in);
        System.out.print("Lütfen Yılı giriniz : ");
        yil = giris.nextInt();
        if ((yil%4)==0){
            System.out.println(yil + " Yılı Artık Bir Yıl Yıldır!...");
        }
        else {
            System.out.println(yil + " Yılı Artık Bir Yıl Değildir!...");
        }
    }
}
