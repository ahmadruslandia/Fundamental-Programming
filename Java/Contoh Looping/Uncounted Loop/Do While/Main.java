import java.util.Scanner;


public class Main {
    public static void main(String[] args ) {
        boolean ulang = true;
        String jawab;
        int i = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("Masukkan huruf y untuk contoh perulangan");
            System.out.println(" ");
            System.out.print("Masukkan huruf : ");
            jawab = input.next();

            if( jawab.equalsIgnoreCase("y") ){
                ulang = true;
            }
            else{
                ulang = false;
            }

            i++;
        }while (ulang);
        System.out.println(" ");
        System.out.println("Selesai");
    }


}