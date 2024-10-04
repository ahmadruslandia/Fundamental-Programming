using System;

namespace Main
{
    class main
    {
        static void tukar(int a, int b)
        {
            int temp;
            temp = a;
            a = b;
            b = temp;

            Console.WriteLine("a = " + a);
            Console.WriteLine("b = " + b);

        }

        static void Main(string[] args)
        {
            int a, b;

            a = 1;
            b = 2;

            tukar(a, b);
        }
    }
}
