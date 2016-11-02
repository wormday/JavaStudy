using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Diagnostics;
using System.Dynamic;

namespace Wormday.JavaStudy.OO.OO5
{
    public interface IOrderBiz
    {
        void Add(AddModel model);
    }

    public class OrderBiz : IOrderBiz
    {
        public void Add(AddModel model)
        {
            //逻辑
        }
    }

    public interface ILogBiz
    {
        void Write(string message);
    }

    public class LogBiz : ILogBiz
    {
        public void Write(string message)
        {

        }
    }

    public interface IMetricLoggerBiz
    {
        void Write(string message, long elapsedMilliseconds);
    }

    public class MetricLoggerBiz : IMetricLoggerBiz
    {
        public void Write(string message, long elapsedMilliseconds)
        {

        }
    }

    public class MetricLoggerHelper : IDisposable
    {
        private Stopwatch _stopWatch = null;
        private string _metricName = null;
        private IMetricLoggerBiz _metric = null;

        public MetricLoggerHelper(string metricName)
        {
            this._metricName = metricName;
            this._stopWatch = new Stopwatch();
            this._metric = new MetricLoggerBiz();
        }

        public void Dispose()
        {
            _stopWatch.Stop();
            _metric.Write("我是记录性能日志的", this._stopWatch.ElapsedMilliseconds);
            _stopWatch = null;
        }
    }

    public class OrderController
    {
        private IOrderBiz biz = new OrderProxyBiz();

        public void Add(AddModel model)
        {
            // 我又可以安心处理我的业务逻辑了
            biz.Add(model);
        }
    }

    public interface IValidatable
    {
        bool Validate();
    }

    public class AddModel : IValidatable
    {
        public string CustomerName { get; set; }
        public int ProductId { get; set; }

        public bool Validate()
        {
            if (string.IsNullOrWhiteSpace(this.CustomerName))
            {
                return false;
            }
            if (this.ProductId <= 0)
            {
                return false;
            }
            return true;
        }
    }

    public class OrderProxyBiz : BizProxyBase, IOrderBiz
    {
        private IOrderBiz biz = new OrderBiz();

        public void Add(AddModel model)
        {
            base.ExecBiz(model, biz.Add);
        }
    }

    public class BizProxyBase
    {
        private ILogBiz log = new LogBiz();

        protected void ExecBiz<TParam>(TParam model, Action<TParam> action)
        {
            using (new MetricLoggerHelper("性能日志")) // 套路2 成功转移
            {
                IValidatable m = model as IValidatable;
                if (m != null && !m.Validate())
                    throw new ArgumentException(); // 纠结的套路1 也成功转移
                log.Write("我要记录参数……"); // 套路3 成功转移
                action(model);
                log.Write("我要记录执行结果……"); // 套路4 成功转移
            }
        }

        public T CreateBizObj<T, U>(T iBiz, U biz)
            where U : T
        {
            
            return biz;
        }
    }
}
