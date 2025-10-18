using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            int i = 10;
            do
            {
                Console.WriteLine($"Looping Do While - {i}");
                i--;
            } while (i > 0);
        }
    }
}
