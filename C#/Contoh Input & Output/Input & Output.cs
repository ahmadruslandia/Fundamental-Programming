using System;

namespace Main
{
    class main
    {
        static void Main(String[] args)
        {
            int i;
            
            Console.Write("Masukkan Data berupa angka : ");
            i = int.Parse(Console.ReadLine());
            
            Console.WriteLine($"Output dari Data yang diinputkan : {i}");
        }
    }
}