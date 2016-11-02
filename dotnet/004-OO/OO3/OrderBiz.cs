using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wormday.JavaStudy.OO.OO3
{
    public interface IOrderBiz
    {
        void Add(string customerName, int productId);
    }

    public class OrderBiz:IOrderBiz
    {
        public void Add(string customerName, int productId)
        {
            //逻辑
        }
    }

    public class OrderController
    {
        public void Add(string customerName, int productId)
        {
            IOrderBiz biz = new OrderBiz();
            biz.Add(customerName, productId);
        }
    }
}
