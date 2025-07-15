import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number you wanna reverse : ");
        int num = in.nextInt();
        int reverse = 0;

        while(num>0){
            int rem = num%10;
            reverse = reverse*10+rem;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
