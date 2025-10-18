import java.util.Scanner;

public class Main {
    static void addition(int a, int b) {
        System.out.println("--------- +");
        System.out.println("Result : " + (a + b));
    }

    static void subtraction(int a, int b) {
        System.out.println("--------- -");
        System.out.println("Result : " + (a - b));
    }

    static void multiplication(int a, int b) {
        System.out.println("--------- *");
        System.out.println("Result : " + (a * b));
    }

    static void division(int a, int b) {
        System.out.println("--------- :");
        System.out.println("Result : " + (a / b));
    }

    public static void main(String[] args) {
        int a, b;
        int varchc;
        Scanner Input1 = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);

        System.out.println("Menu\n");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication   ");
        System.out.println("4. Division   \n");
        System.out.print("Enter : ");
        varchc = Input1.nextInt();

        if (varchc == 1){
            System.out.println("\nPlease Enter Number \n");
            System.out.print("Number : ");
            a = Input2.nextInt();
            System.out.print("Number : ");
            b = Input2.nextInt();
            addition(a, b);
        }
        else if (varchc == 2){
            System.out.println("\nPlease Enter Number \n");
            System.out.print("Number : ");
            a = Input2.nextInt();
            System.out.print("Number : ");
            b = Input2.nextInt();
            subtraction(a, b);
        }
        else if (varchc == 3){
            System.out.println("\nPlease Enter Number \n");
            System.out.print("Number : ");
            a = Input2.nextInt();
            System.out.print("Number : ");
            b = Input2.nextInt();
            multiplication(a, b);
        }
        else if (varchc == 4){
            System.out.println("\nPlease Enter Number \n");
            System.out.print("Number : ");
            a = Input2.nextInt();
            System.out.print("Number : ");
            b = Input2.nextInt();
            division(a, b);
        }
        else {
            System.out.println("Enter Your Choice (1..4)");
        }
    }
}