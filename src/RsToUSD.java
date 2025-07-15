import java.util.Scanner;

public class RsToUSD {
    public static void main(String[] args) {
        System.out.println("Enter amount ₹:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float exchangeRate = 85.96f;
        float USD = n/exchangeRate;
        System.out.println("Value in USD :"+ USD);
    }
}
