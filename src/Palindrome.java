import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int original = num;
        int reverse = 0;

        while(num>0) {
            int digit = num % 10; // last digit
            reverse = reverse * 10 + digit; // adding digit in reverse order;
            num = num / 10; // remove last digit
        }
            if(original == reverse ){
                System.out.println("Palindrome!!");
                return;
            }
            else{
                System.out.println("No Palindrome!!");
            }


    }
}
