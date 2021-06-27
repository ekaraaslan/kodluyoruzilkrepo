package deneme;
import java.util.Scanner;
public class PalindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        // Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
        // 121 % 10 = 1, reverseNumber = 1, 121/10 = 12
        // 12 % 10 = 2, reverseNumber = reverseNumber * 10 + 2 = 12, 12/10 = 1
        // 1 % 10 = 1, reverseNumber = reverseNumber * 10 + 1= 121 , 1 / 10 = 0.1 = 0
        Scanner giris=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi= giris.nextInt();
        if (isPalindrom(sayi)){
            System.out.println(sayi + " sayısı Palindrom bir sayıdır.");
        }
        else{
            System.out.println(sayi + " sayısı Palindrom sayı değildir.");
        }
    }
}
