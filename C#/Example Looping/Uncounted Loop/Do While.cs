using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            char ulang = 'y';
            int i = 0;

            do
            {
                Console.WriteLine();
                Console.WriteLine("Masukkan huruf y untuk contoh perulangan");
                Console.WriteLine();
                Console.Write("Masukkan huruf : ");
                ulang = char.Parse(Console.ReadLine());
                i++;
            } while (ulang == 'y');

            Console.WriteLine();
            Console.WriteLine("Selesai");

        }
    }
}
