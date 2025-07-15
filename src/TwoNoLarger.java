import java.util.Scanner;

public class TwoNoLarger {
    public static void main(String[] args) {
        System.out.println("Enter first no. ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.println("Enter Second no. ");
        int n2 = in.nextInt();
        if (n1>n2){
            System.out.println("First no. is greater");
        }
        else {
            System.out.println("Second no. is greater");
        }
    }
}
