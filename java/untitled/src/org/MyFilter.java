import javax.servlet.*;
import java.io.IOException;

/**
 * Created by sunwq on 2016/12/2.
 */
public class MyFilter implements Filter {
    public void destroy() {
        System.out.println("MyFilter.destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        System.out.println("MyFilter.doFilter");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("MyFilter.init");
    }

}
