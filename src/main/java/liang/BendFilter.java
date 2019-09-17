package liang;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "bend",  urlPatterns = "/")
public class BendFilter implements Filter {

    FilterConfig filterConfig = null;

    public void init(FilterConfig fConfig) throws ServletException {
        this.filterConfig = fConfig;
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
//        System.out.println(((HttpServletRequest) request).getServletPath());
        System.out.println("In BendFilter before doFilter");
        chain.doFilter(request, response);

    }



}
