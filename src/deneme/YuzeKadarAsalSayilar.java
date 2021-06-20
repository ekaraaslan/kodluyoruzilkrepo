package deneme;
public class YuzeKadarAsalSayilar {
    public static void main(String[] args) {
        int sayac = 0;
        for (int x=2;x<=100;x++){
            for(int i = 2; i < x; i++) {
                if(x % i == 0) {
                    sayac++;
                    }
                }
            if(sayac == 0) {
                System.out.print(x + ", ");
            }
            sayac=0;
        }
    }
}
