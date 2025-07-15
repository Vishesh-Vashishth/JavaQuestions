import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your word : ");
        char letter = in.next().trim().charAt(0);
        if (letter >= 'a' && letter <= 'z'){
            System.out.println("Small letter");
        }
        if (letter >= 'A' && letter <= 'Z'){
            System.out.println("Capital letter");
        }
    }
}
