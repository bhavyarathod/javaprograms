import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter your email id: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println("Your email is " +email);

        if(email.matches(".*@.*") ) {

            if (!email.matches("\\s+")) {
                String[] splitstring = email.split("@");
                int ch = email.codePointAt(0);

                if (ch >= 97 && ch <= 122) {
                    System.out.println("ur email is valid");
                } else
                    System.out.println(" first character must be small");
            } else {
                System.out.println("ur email is not valid(contains blank space");
            }
        }
        else
            {
            System.exit(0);
            System.out.println(" not valid email");
            }
    }
}

