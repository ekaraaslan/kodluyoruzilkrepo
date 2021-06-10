package deneme;
import org.w3c.dom.Text;

import java.util.Scanner;
public class Zodyag {
    public static void main(String[] args) {
        int yil,mod;
        String burc = "";
        Scanner giris=new Scanner(System.in);
        System.out.print("Lütfen Doğum Yılınızı Giriniz : ");
        yil = giris.nextInt();
        mod = (yil % 12);
        switch (mod){
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağına Göre Burcunuz : " + burc);
    }
}
