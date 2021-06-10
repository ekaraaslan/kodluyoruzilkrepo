package deneme;

import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu metre cinsinden giriniz : ");
        double Boy = inp.nextDouble();
        System.out.print("Lütfen Kilonuzun giriniz : ");
        double Kilo = inp.nextFloat();
        double vki = Kilo / (Boy * Boy);
        System.out.println("Vücut Kitle Endeksiniz : " + vki);
    }
}
