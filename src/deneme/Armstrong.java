package deneme;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();//girilen sayı
        int basNumber = 0;           //basamak sayısı
        int tempNumber = number;     //geçici değişken
        int basValue;                //basamak değeri
        int result = 0;              //sonuç
        int basPow;                  //basamak üssü
        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber != 0){
            basValue=tempNumber % 10;
            basPow=1;
            for (int i=1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if (result == number){
            System.out.println(number + " sayısı bir Armstrong Sayıdır...");
        } else {
            System.out.println(number + " sayısı bir Armstrong Sayı değildir...");
        }
        /*
        //Basamak sayısını bulmak
        //2451 / 10 = 245
        //245 / 10 = 24
        //24 / 10 = 2
        //2 / 10 = 0
        int a = 2451;
        int numberCounter=0;
        while (a != 0 ){
            a /= 10;
            numberCounter++;
            System.out.println(a);
        }
        System.out.println("Basamak Sayısı : " + numberCounter);
        System.out.println("——————————————————————————————————————————————————");
        //Bir sayının son basamağını bulmak
        // 2451 % 10 = 1
        int b = 2451;
        int c = b%10;
        System.out.println(b + " Sayısının Son Basamağı : " + c);
        System.out.println("——————————————————————————————————————————————————");
        //Üs bulmak
        int sub=2, sup=3;
        int result = 1;
        for (int i=1;i<=sup;i++){
            result *= sub;
        }
        System.out.println(sub + " Sayısının " + sup + ". Kuvveti = " + result);*/
    }
}
