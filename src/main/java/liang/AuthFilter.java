package liang;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "auth", urlPatterns = "/")
public class AuthFilter implements Filter {

    FilterConfig filterConfig = null;

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("In AuthFilter before doFilter");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig fConfig) throws ServletException {
        this.filterConfig = fConfig;
    }
    public void destroy() {
    }

}
