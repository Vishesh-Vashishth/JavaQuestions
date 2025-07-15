import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int original = num;
        int result = 0;

        // Count number of digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        if (original == result) {
            System.out.println("Armstrong Number!");
        } else {
            System.out.println("Not an Armstrong Number.");
        }
    }
}
