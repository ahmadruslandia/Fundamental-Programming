using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            int pil;

            Console.WriteLine("Menu :\n");
            Console.WriteLine("Masukan Angka : 1 Contoh If");
            Console.WriteLine("Masukan Angka : 2 Contoh Else If");
            Console.WriteLine("Masukan Angka Selain 1 dan 2 Untuk Contoh Else\n");
            Console.Write("Silahkan Masukan Angka : ");
            pil = int.Parse(Console.ReadLine());

            if (pil == 1)
            {
                Console.WriteLine("\nini Adalah Contoh If");
            }
            else if (pil == 2)
            {
                Console.WriteLine("\nini Adalah Contoh Else If");
            }
            else
            {
                Console.WriteLine("\nini Adalah Contoh Else");
            }

        }
    }
}
