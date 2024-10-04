using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            char[] huruf = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
            huruf[1] = 'x';
            huruf[9] = 'z';

            Console.WriteLine($"Huruf : {huruf[1]}");
            Console.WriteLine($"Huruf : {huruf[9]}");
        }
    }
}
