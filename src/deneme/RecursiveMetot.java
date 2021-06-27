package deneme;

public class RecursiveMetot {
    public static void main(String[] args) {
        System.out.println(f(3));
    }
    static int f(int n){
        System.out.println("n => " + n);
        if (n == 1){
            return 1;
        }
        int result = f(n-1)+n;
        System.out.println("Result => " + result);
        return result;
    }
}
