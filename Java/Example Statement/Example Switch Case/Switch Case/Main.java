import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String varchc;
        Scanner terminalInput = new Scanner(System.in);

        System.out.println("Menu\n");
        System.out.println("1. First Example       ");
        System.out.println("2. Second Example      ");
        System.out.println("3. Third Example       ");
        System.out.println("3. Fourth Example    \n");
        System.out.print("Enter your Choice : ");
        varchc = terminalInput.next();
        switch (varchc) {
            case "1":
                System.out.println("Example 1st Succeed");
                break;
            case "2":
                System.out.println("Example 2nd Succeed");
                break;
            case "3":
                System.out.println("Example 3rd Succeed");
                break;
            case "4":
                System.out.println("Example 4th Succeed");
                break;
            default:
                System.err.println("Enter your Choice Correctly");
                break;
        }
    }
}