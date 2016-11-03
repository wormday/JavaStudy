using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wormday.JavaStudy.Inherit
{
    class Program
    {
        static void Main(string[] args)
        {
            IA o1 = new C();
            Console.WriteLine(o1.M1());
            Console.ReadLine();
        }
    }

    public interface IA
    {
        string M1();
    }

    public class A:IA
    {
        public virtual string M2() { return "A.M2"; }
        public virtual string M1() { return "A.M1"; }
    }

    public class B : A
    {
        public override string M2() { return "B.M2"; }
        public override string M1() { return "B.M1"; }
    }

    public class C : B
    {
        public override string M2() { return "C.M2"; }
        public new string M1() { return "C.M1"; }
    }
}
