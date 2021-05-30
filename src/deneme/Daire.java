package deneme;



import java.util.Scanner;

public class Daire {
    public Daire() {
    }

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        int r = inp.nextInt();
        double alan = pi * (double)r * (double)r;
        double cevre = 2.0D * pi * (double)r;
        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
}
