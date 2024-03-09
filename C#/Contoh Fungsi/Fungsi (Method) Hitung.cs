using System;

namespace Main
{
    class main
    {
        static void pertambahan(int a, int b)
        {
            Console.WriteLine("--------- +");
            Console.WriteLine($"Hasil : {a + b}");
        }
        static void pengurangan(int a, int b)
        {
            Console.WriteLine("--------- -");
            Console.WriteLine($"Hasil : {a - b}");
        }
        static void perkalian(int a, int b)
        {
            Console.WriteLine("--------- *");
            Console.WriteLine($"Hasil : {a * b}");
        }
        static void pembagian(int a, int b)
        {
            Console.WriteLine("--------- :");
            Console.WriteLine($"Hasil : {a / b}");
        }

        static void Main(string[] args)
        {
            int a, b;
            int pilihan;

            Console.WriteLine("Menu\n");
            Console.WriteLine("1. Pertambahan");
            Console.WriteLine("2. Pengurangan");
            Console.WriteLine("3. Perkalian");
            Console.WriteLine("4. Pembagian \n");
            Console.Write("Masukkan Pilihan : ");
            pilihan = int.Parse(Console.ReadLine());

            if (pilihan == 1)
            {
                Console.WriteLine("\nSilahkan Masukkan Angka \n");
                Console.Write("Angka : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Angka : ");
                b = int.Parse(Console.ReadLine());
                pertambahan(a, b);
            }
            else if (pilihan == 2)
            {
                Console.WriteLine("\nSilahkan Masukkan Angka \n");
                Console.Write("Angka : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Angka : ");
                b = int.Parse(Console.ReadLine());
                pengurangan(a, b);
            }
            else if (pilihan == 3)
            {
                Console.WriteLine("\nSilahkan Masukkan Angka \n");
                Console.Write("Angka : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Angka : ");
                b = int.Parse(Console.ReadLine());
                perkalian(a, b);
            }
            else if (pilihan == 4)
            {
                Console.WriteLine("\nSilahkan Masukkan Angka \n");
                Console.Write("Angka : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Angka : ");
                b = int.Parse(Console.ReadLine());
                pembagian(a, b);
            }
            else
            {
                Console.WriteLine("Masukkan pilihan (1..4)");
            }
        }
    }
}