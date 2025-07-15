import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        System.out.println("Enter upto which you want series : ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print(n1+" ");
            int next = n1+n2;
            n1 = n2;
            n2 = next;
        }
    }
}
