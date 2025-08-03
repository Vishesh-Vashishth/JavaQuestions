import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter a number to check weather its prime or not : ");
        int n = in.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }

    static boolean prime(int number) {
        if(number <= 1){
            return false;
        }
        int c = 2;
        while(c*c<number){
            if(number%c==0){
                return false;
            }
            c++;
        }
        return c * c > number;           //  if (c * c > number) return true;
                                         // else return false;
    }
}
