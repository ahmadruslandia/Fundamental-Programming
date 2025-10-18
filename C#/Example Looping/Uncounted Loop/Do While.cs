using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            char vartry = 'y';
            int i = 0;

            do
            {
                Console.WriteLine();
                Console.WriteLine("Enter y for Example");
                Console.WriteLine();
                Console.Write("Enter : ");
                vartry = char.Parse(Console.ReadLine());
                i++;
            } while (vartry == 'y');

            Console.WriteLine();
            Console.WriteLine("Done");

        }
    }
}
