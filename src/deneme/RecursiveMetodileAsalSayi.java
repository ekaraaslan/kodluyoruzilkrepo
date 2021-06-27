package deneme;
import java.util.Scanner;
public class RecursiveMetodileAsalSayi {
    public static void main(String[] args) {
        int basla,bitir;
        Scanner giris=new Scanner(System.in);
        System.out.print("Başlangıç Sayısını Giriniz : ");
        basla = giris.nextInt();
        System.out.print("Bitiş Sayısını Giriniz : ");
        bitir = giris.nextInt();
        sonuc(basla,bitir);
    }
    static void sonuc(int basla, int bitir){
        if (basla<=bitir){
            if (asal(basla)){
                System.out.println(basla);
            }
            basla +=1;
            sonuc(basla,bitir);
        }
    }
    static boolean asal(int sayi){
        for (int i=2;i<sayi;i++){
            if ((sayi % i)==0){
                return false;
            }
        }
        return true;
    }
}
