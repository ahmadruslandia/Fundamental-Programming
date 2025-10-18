using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            int varchc;

            Console.WriteLine("Menu :\n");
            Console.WriteLine("1. First Example            ");
            Console.WriteLine("2. Second Example           ");
            Console.WriteLine("3. Third Example            ");
            Console.WriteLine("4. Fourth Example         \n");
            Console.Write("Enter your Choice : ");
            varchc = int.Parse(Console.ReadLine());

            switch (varchc)
            {
                case 1:
                    Console.Clear();
                    Console.WriteLine("Example 1st Succeed");
                    break;
                case 2:
                    Console.Clear();
                    Console.WriteLine("Example 2nd Succeed");
                    break;
                case 3:
                    Console.Clear();
                    Console.WriteLine("Example 3rd Succeed");
                    break;
                case 4:
                    Console.Clear();
                    Console.WriteLine("Example 4th Succeed");
                    break;
                default:
                    Console.Clear();
                    Console.WriteLine("Enter your Choice Correctly");
                    break;
            }

        }
    }
}
