import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminalInput = new Scanner(System.in);
        int i;

        System.out.print("Masukkan Data berupa angka : ");
        i = terminalInput.nextInt();
        System.out.print("Output dari Data yang diinputkan : " + i);

    }

}