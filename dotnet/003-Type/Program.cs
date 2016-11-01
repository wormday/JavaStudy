using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _003_Type
{
    class Program
    {
        static void Main(string[] args)
        {
            int b=1000;
            checked
            {
                Console.WriteLine((byte)b);
            }
            Console.ReadLine();
        }
    }
}
