import java.util.Scanner;

public class PesoanlisedGreeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String naam) {
        String message = "Hello!" + naam;
        return (message);
    }
}
