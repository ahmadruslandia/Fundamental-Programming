using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            char[] huruf = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine($"Huruf : {huruf[i]}");
            }
        }
    }
}
