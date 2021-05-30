package deneme;
import java.util.Scanner;
public class kullanicigiris {
    public static void main(String[] args) {
        String userName, passWord;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullnaıcı adını giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        passWord = input.nextLine();
        if (userName.equals("ertan") && passWord.equals("123456")){
            System.out.println("Merhaba, giriş yaptınız...");
        }
        else {
            System.out.println("Üzgünüm, Bilgileriniz yanlış...");
        }
    }
}
