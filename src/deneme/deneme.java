package deneme;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz.
        int mat, fiz, kim, biyo, turk;
        //Scanner sınıfımızı tanımlıyoruz
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.println("Fizik Notunuzu giriniz: ");
        fiz = inp.nextInt();
        System.out.println("Kimya Notunuzu giriniz: ");
        kim = inp.nextInt();
        System.out.println("Biyoloji Notunuzu giriniz: ");
        biyo = inp.nextInt();
        System.out.println("Türkçe Notunuzu giriniz: ");
        turk = inp.nextInt();
        int toplam = mat + fiz + kim + biyo + turk;
        double sonuc = toplam / 5;
        System.out.println("Ortalama Notunuz : " + sonuc);
    }
}
