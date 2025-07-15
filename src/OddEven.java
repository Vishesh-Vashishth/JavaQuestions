import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter a number to check Odd or Even: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
