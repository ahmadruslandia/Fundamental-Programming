using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            char[] varlttr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
            varlttr[1] = 'x';
            varlttr[9] = 'z';

            Console.WriteLine($"Letter : {varlttr[1]}");
            Console.WriteLine($"Letter : {varlttr[9]}");
        }
    }
}
