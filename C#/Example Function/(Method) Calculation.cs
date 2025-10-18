using System;

namespace Main
{
    class main
    {
        static void addition(int a, int b)
        {
            Console.WriteLine("--------- +");
            Console.WriteLine($"Result : {a + b}");
        }
        static void subtraction(int a, int b)
        {
            Console.WriteLine("--------- -");
            Console.WriteLine($"Result : {a - b}");
        }
        static void multiplication(int a, int b)
        {
            Console.WriteLine("--------- *");
            Console.WriteLine($"Result : {a * b}");
        }
        static void division(int a, int b)
        {
            Console.WriteLine("--------- :");
            Console.WriteLine($"Result : {a / b}");
        }

        static void Main(string[] args)
        {
            int a, b;
            int varchc;

            Console.WriteLine("Menu\n");
            Console.WriteLine("1. Addition");
            Console.WriteLine("2. Subtraction");
            Console.WriteLine("3. Multiplication");
            Console.WriteLine("4. Division \n");
            Console.Write("Enter : ");
            varchc = int.Parse(Console.ReadLine());

            if (varchc == 1)
            {
                Console.WriteLine("\nPlease Enter Number \n");
                Console.Write("Number : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Number : ");
                b = int.Parse(Console.ReadLine());
                addition(a, b);
            }
            else if (varchc == 2)
            {
                Console.WriteLine("\nPlease Enter Number \n");
                Console.Write("Number : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Number : ");
                b = int.Parse(Console.ReadLine());
                subtraction(a, b);
            }
            else if (varchc == 3)
            {
                Console.WriteLine("\nPlease Enter Number \n");
                Console.Write("Number : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Number : ");
                b = int.Parse(Console.ReadLine());
                multiplication(a, b);
            }
            else if (varchc == 4)
            {
                Console.WriteLine("\nPlease Enter Number \n");
                Console.Write("Number : ");
                a = int.Parse(Console.ReadLine());
                Console.Write("Number : ");
                b = int.Parse(Console.ReadLine());
                division(a, b);
            }
            else
            {
                Console.WriteLine("Enter Your Choice (1..4)");
            }
        }
    }
}