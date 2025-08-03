import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans2 = sum3(20,30);
        System.out.println(ans2);
    }

    static int sum3(int i, int i1) {
        int sum= i+i1;
        return sum;
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First no. : ");
        int n1 = in.nextInt();
        System.out.print("Enter Second no. : ");
        int n2 = in.nextInt();
        return (n1+n2);

    }

}
