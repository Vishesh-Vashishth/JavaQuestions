import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Principle :");
        int p = in.nextInt();
        System.out.print("Input Time : ");
        int t = in.nextInt();
        System.out.print("Input Rate : ");
        float r = in.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("Simple Interset is : " + si);
    }
}
