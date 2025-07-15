import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int max = a;
//
//        if(b>a){
//            max = b;
//        }
//        if (c>b){
//            max = c;
//        }
//        System.out.println(max);

// Second approach :
//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > b) {
//            max = c;
//        }
//        System.out.println(max);

        // Third Approach

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}