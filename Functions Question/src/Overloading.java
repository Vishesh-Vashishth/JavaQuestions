import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int ans = sumNumber(2,3,8);
        System.out.println(ans);
    }

    private static int sumNumber(int a , int b) {
        int sum = a+b;
        return sum;
    }

    private static int sumNumber(int a , int b, int c) {
        int sum = a+b+c;
        return sum;
    }
}
