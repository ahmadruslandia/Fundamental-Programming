import java.util.Scanner;

public class Main {
    static void pertambahan(int a, int b) {
        System.out.println("--------- +");
        System.out.println("Hasil : " + (a + b));
    }

    static void pengurangan(int a, int b) {
        System.out.println("--------- -");
        System.out.println("Hasil : " + (a - b));
    }

    static void perkalian(int a, int b) {
        System.out.println("--------- *");
        System.out.println("Hasil : " + (a * b));
    }

    static void pembagian(int a, int b) {
        System.out.println("--------- :");
        System.out.println("Hasil : " + (a / b));
    }

    public static void main(String[] args) {
        int a, b;
        int pilihan;
        Scanner Input1 = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);

        System.out.println("Menu\n");
        System.out.println("1. Pertambahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian   ");
        System.out.println("4. Pembagian   \n");
        System.out.print("Masukkan Pilihan : ");
        pilihan = Input1.nextInt();

        if (pilihan == 1){
            System.out.println("\nSilahkan Masukkan Angka\n");
            System.out.print("Angka : ");
            a = Input2.nextInt();
            System.out.print("Angka : ");
            b = Input2.nextInt();
            pertambahan(a, b);
        }
        else if (pilihan == 2){
            System.out.println("\nSilahkan Masukkan Angka\n");
            System.out.print("Angka : ");
            a = Input2.nextInt();
            System.out.print("Angka : ");
            b = Input2.nextInt();
            pengurangan(a, b);
        }
        else if (pilihan == 3){
            System.out.println("\nSilahkan Masukkan Angka\n");
            System.out.print("Angka : ");
            a = Input2.nextInt();
            System.out.print("Angka : ");
            b = Input2.nextInt();
            perkalian(a, b);
        }
        else if (pilihan == 4){
            System.out.println("\nSilahkan Masukkan Angka\n");
            System.out.print("Angka : ");
            a = Input2.nextInt();
            System.out.print("Angka : ");
            b = Input2.nextInt();
            pembagian(a, b);
        }
        else {
            System.out.println("Masukkan pilihan (1..4)");
        }
    }
}