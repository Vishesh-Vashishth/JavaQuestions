import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First No.");
        int n1 = in.nextInt();
        System.out.println("Enter Second No.");
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println("The sum is :" + sum);
    }
}
