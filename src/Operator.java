import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        System.out.print("Enter first Number ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.print("Enter second Number ");
        int n2 = in.nextInt();
        System.out.println("Choose operator : +,-,*,/ ");
        String op = in.next();
        if(op.equals("+")){
            System.out.println("Sum is " + (n1+n2));
        }
        else if(op.equals("-")){
            System.out.println("Sum is " + (n1-n2));
        }
        else if(op.equals("*")){
            System.out.println("Sum is " + (n1*n2));
        }
        else if(op.equals("/")){
            System.out.println("Sum is " + (n1/n2));
        }
        else{
            System.out.println("you choose wrong operator");
        }
    }
}
