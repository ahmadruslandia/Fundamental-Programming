import java.util.Scanner;


public class Main {
    public static void main(String[] args ) {
        boolean vartry = true;
        String varchc;
        int i = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("Enter y for Example");
            System.out.println(" ");
            System.out.print("Enter : ");
            varchc = input.next();

            if( varchc.equalsIgnoreCase("y") ){
                vartry = true;
            }
            else{
                vartry = false;
            }

            i++;
        }while (vartry);
        System.out.println(" ");
        System.out.println("Done");
    }


}