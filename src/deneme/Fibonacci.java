package deneme;

public class Fibonacci {
    public static void main(String[] args) {
        //Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        int os=0,ss=1,st;
        System.out.print(ss);
        for (int x=1;x<=10;x++){
            st = ss + os;
            os=ss;
            ss=st;
            System.out.print(", " + st);
        }
    }
}
