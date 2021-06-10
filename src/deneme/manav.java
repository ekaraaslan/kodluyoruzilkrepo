package deneme;

import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double armutBF=2.14;
        double elmaBF=3.67;
        double domatesBF=1.11;
        double muzBF=0.95;
        double patlicanBF=5.0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Alınan Armut Miktarını Giriniz : ");
        double armutMiktar=inp.nextDouble();
        System.out.print("Alınan Elma Miktarını Giriniz : ");
        double elmaMiktar=inp.nextDouble();
        System.out.print("Alınan Domates Miktarını Giriniz : ");
        double domatesMiktar=inp.nextDouble();
        System.out.print("Alınan Muz Miktarını Giriniz : ");
        double muzMiktar=inp.nextDouble();
        System.out.print("Alınan Patlıcan Miktarını Giriniz : ");
        double patlicanMiktar=inp.nextDouble();
        double tutar = armutBF*armutMiktar + elmaBF*elmaMiktar + domatesBF*domatesMiktar + muzBF*muzMiktar + patlicanMiktar*patlicanBF;
        System.out.println("Toplam Tutar :" + tutar);
    }
}
