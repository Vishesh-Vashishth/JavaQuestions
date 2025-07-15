import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=1){
            System.out.println("no prime no composite");
            return;
        }
        int c=2;
        if(n==4){
            System.out.println("No prime");
            return;
        }
        else{
            while(c*c<n){
                if (n%c==0){
                    System.out.println("No prime");
                    return;
                }
                c=c+1;
            }
            if(c*c>n){
                System.out.println("prime");
            }
        }
    }
}
