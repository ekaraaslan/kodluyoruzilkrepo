package deneme;
import java.util.Scanner;
public class ATM_Projesi {
    public static void main(String[] args) {
        String userName, passWord;
        Scanner input=new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right>0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            passWord = input.nextLine();
            if (userName.equals("ertan") && passWord.equals("123456")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoş Geldiniz...");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorma\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if (select==1){
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    }else if (select==2){
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye Yetersiz.");
                        }else{
                            balance -= price;
                        }
                    }else if(select==3){
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                break;
            }else{
                right--;
                System.out.println("Kullanıcı adı veya parola yanlış. Tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Kullanıcı Hesabınız Bloke Olmuştur.");
                    System.out.println("Lütfen Banka ile iletişime geçiniz...");
                }else{
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
