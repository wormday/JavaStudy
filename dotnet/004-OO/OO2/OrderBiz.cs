using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wormday.JavaStudy.OO.OO2
{
    public class OrderBiz
    {
        public static void Add(string customerName, int productId)
        {
            //逻辑
        }
    }

    public class OrderController
    {
        public void Add(string customerName, int productId)
        {
            OrderBiz.Add(customerName, productId);
        }
    }
}