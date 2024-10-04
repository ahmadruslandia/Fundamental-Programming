using System;

namespace Main
{
    class main
    {
        static void Main(String[] args)
        {
            int i;
            
            Console.Write("Masukkan Data Berupa Angka : ");
            i = int.Parse(Console.ReadLine());
            
            Console.WriteLine($"Output dari Data yang Di Inputkan : {i}");
        }
    }
}