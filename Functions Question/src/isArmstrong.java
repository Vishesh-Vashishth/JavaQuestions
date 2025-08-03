import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check armstrong or not");
        int n = in.nextInt();
        boolean ans = armstrong(n);
        System.out.println(ans);
    }

    static boolean armstrong(int number) {
        int original = number;
        int sum = 0;
        while(number>0){
            int rem = number%10;
            number = number/10;
            sum = sum+rem*rem*rem;
        }
        return sum == original;
    }
}
