import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int varchc;
        Scanner terminalInput = new Scanner(System.in);

        System.out.println("Menu\n");
        System.out.println("Enter Number : 1 for Example If");
        System.out.println("Enter Number : 2 for Example Else If");
        System.out.println("Enter Number other 1 and 2 for Example Else\n");
        System.out.print("Please Enter Number : ");
        varchc = terminalInput.nextInt();

        if (varchc == 1){
            System.out.println("\nExample If");
        }
        else if (varchc == 2){
            System.out.println("\nExample Else If");
        }
        else {
            System.out.println("\nExample Else");
        }
    }
}
