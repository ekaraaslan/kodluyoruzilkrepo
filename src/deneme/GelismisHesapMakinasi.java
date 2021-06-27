package deneme;
import java.util.Scanner;
public class GelismisHesapMakinasi {
    static void toplama(){
        int a,b;
        Scanner giris = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        a = giris.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        b = giris.nextInt();
        System.out.println(a + "+" + b + " = " + (a + b));
    }
    static void cikarma(){
        int a,b;
        Scanner giris = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        a = giris.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        b = giris.nextInt();
        System.out.println(a + "-" + b + " = " + (a - b));
    }
    static void carpma(){
        int a,b;
        Scanner giris = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        a = giris.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        b = giris.nextInt();
        System.out.println(a + "x" + b + " = " + (a * b));
    }
    static void bolme(){
        float a,b;
        Scanner giris = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        a = giris.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        b = giris.nextInt();
        System.out.println(a + "/" + b + " = " + (a / b));
    }
    static void uslu(){
        int a,b,power=1;
        Scanner giris = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        a = giris.nextInt();
        System.out.print("üs sayısını (kuvveti) giriniz : ");
        b = giris.nextInt();
        for (int x=1;x<=b;x++){
            power *= a;
        }
        System.out.println(a + "^" + b + " = " + power);
    }
    static void mod(){
        int a,b;
        Scanner giris = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        a = giris.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        b = giris.nextInt();
        System.out.println(a + " sayısının " + b + " ile bölümünden kalan (" + a + "mod" + b +") = " + (a % b));
    }
    static void alan(){
        int a,b;
        Scanner giris = new Scanner(System.in);
        System.out.print("Dikdörtgenin enini giriniz : ");
        a = giris.nextInt();
        System.out.print("Dikdörtgenin boyunu giriniz : ");
        b = giris.nextInt();
        System.out.println("Eni :" + a + ", Boyu :" + b + " olan Dikdörtgenin Alanı : " + (a * b) + " birim karedir.");
        System.out.println("Eni :" + a + ", Boyu :" + b + " olan Dikdörtgenin Çevresi : " + (a + b) * 2 + " birimdir.");
    }
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int secim;
        String menu = "1- Toplama\n"
                +"2- Çıkarma\n"
                +"3- Çarpma\n"
                +"4- Bölme\n"
                +"5- Üslü Sayılar\n"
                +"6- Mod Alma\n"
                +"7- Dikdörtgen Alanı ve Çevre Hesabı\n"
                +"8- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            secim = giris.nextInt();
            switch (secim){
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    uslu();
                    break;
                case 6:
                    mod();
                    break;
                case 7:
                    alan();
                    break;
                default:
                    break;
            }
        } while (secim != 0);
    }
}
