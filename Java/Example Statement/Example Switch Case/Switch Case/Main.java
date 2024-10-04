import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pilihan;
        Scanner terminalInput = new Scanner(System.in);

        System.out.println("Menu\n");
        System.out.println("1. Contoh Ke Satu     ");
        System.out.println("2. Contoh Ke Dua      ");
        System.out.println("3. Contoh Ke Tiga     ");
        System.out.println("3. Contoh Ke Empat  \n");
        System.out.print("Masukan Pilihan : ");
        pilihan = terminalInput.next();
        switch (pilihan) {
            case "1":
                System.out.println("Contoh Ke-1 Berhasil Dicoba");
                break;
            case "2":
                System.out.println("Contoh Ke-2 Berhasil Dicoba");
                break;
            case "3":
                System.out.println("Contoh Ke-3 Berhasil Dicoba");
                break;
            case "4":
                System.out.println("Contoh Ke-4 Berhasil Dicoba");
                break;
            default:
                System.err.println("Masukkan Pilihan Dengan Benar");
                break;
        }
    }
}