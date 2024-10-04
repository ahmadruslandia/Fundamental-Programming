import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int pil;
        Scanner terminalInput = new Scanner(System.in);

        System.out.println("Menu\n");
        System.out.println("Masukan Angka : 1 Contoh If");
        System.out.println("Masukan Angka : 2 Contoh Else If");
        System.out.println("Masukan Angka Selain 1 dan 2 Untuk Contoh Else\n");
        System.out.print("Silahkan Masukan Angka : ");
        pil = terminalInput.nextInt();

        if (pil == 1){
            System.out.println("\nini Adalah Contoh If");
        }
        else if (pil == 2){
            System.out.println("\nini Adalah Contoh Else If");
        }
        else {
            System.out.println("\nini Adalah Contoh Else");
        }
    }
}
