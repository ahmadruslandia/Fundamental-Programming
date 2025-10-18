using System;

namespace Main
{
    class main
    {
        static void Main(string[] args)
        {
            string data1, data2;

            Console.WriteLine("Login :\n");
            Console.Write("username : ");
            data1 = Console.ReadLine();
            Console.Write("password : ");
            data2 = Console.ReadLine();

            if (data1 == "user1")
            {
                if (data2 == "psw123")
                {
                    Console.WriteLine("\nyou succeeded");
                }
                else
                {
                    Console.WriteLine("\nwrong password");
                }
            }
            else
            {
                Console.WriteLine("\nwrong username");
            }

        }
    }
}
