using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            int varchc;

            Console.WriteLine("Menu :\n");
            Console.WriteLine("Enter Number : 1 for Example If");
            Console.WriteLine("Enter Number : 2 for Example Else If");
            Console.WriteLine("Enter Number other 1 and 2 for Example Else\n");
            Console.Write("Please Enter Number : ");
            varchc = int.Parse(Console.ReadLine());

            if (varchc == 1)
            {
                Console.WriteLine("\nExample If");
            }
            else if (varchc == 2)
            {
                Console.WriteLine("\nExample Else If");
            }
            else
            {
                Console.WriteLine("\nExample Else");
            }

        }
    }
}
