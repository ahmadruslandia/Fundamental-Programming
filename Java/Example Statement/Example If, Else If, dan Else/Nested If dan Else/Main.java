import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data1, data2;
        Scanner input = new Scanner(System.in);

        System.out.println("Login \n");
        System.out.print("username : ");
        data1 = input.nextLine();
        System.out.print("password : ");
        data2 = input.nextLine();

        if (data1.equalsIgnoreCase("user1")){
            if (data2.equalsIgnoreCase("psw123")){
                System.out.println("\nanda berhasil mencoba");
            }
            else {
                System.out.println("\npassword salah");
            }
        }
        else {
            System.out.println("\nusername anda salah");
        }
    }
}
