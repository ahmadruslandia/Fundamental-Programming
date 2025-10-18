using System;

namespace Main
{
    class main
    {
        static void Main(String[] args)
        {
            int i;
            
            Console.Write("Enter the Number : ");
            i = int.Parse(Console.ReadLine());
            
            Console.WriteLine($"Your Data Input : {i}");
        }
    }
}