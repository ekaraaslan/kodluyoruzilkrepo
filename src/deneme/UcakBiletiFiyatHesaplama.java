package deneme;
import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
        sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        • Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
          Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        • Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        • Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        • Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        • Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */
        int mesafe,yas,yolculuktipi;
        double Ucret;
        Scanner giris = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz (Km) : ");
        mesafe = giris.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = giris.nextInt();
        System.out.print("Yolculuk tipini giriniz (1: Tek yön / 2: Gidiş-Dönüş) : ");
        yolculuktipi = giris.nextInt();
        if (mesafe<0 || yas<0 || yolculuktipi<0 || yolculuktipi>2){
            System.out.println("Yanlış giriş yaptınız!...");
        } else {
            Ucret = mesafe * 0.1;
            if (yas<12){
                Ucret = Ucret * 0.5;
            } else if (yas>12 && yas<24) {
                Ucret = Ucret * 0.9;
            } else if (yas>65) {
                Ucret = Ucret * 0.7;
                if (yolculuktipi==2){
                    Ucret = Ucret * 1.6;
                }
            }
            System.out.println("Toplam Ücret : " + Ucret + " TL.'dir.");
        }
    }
}
