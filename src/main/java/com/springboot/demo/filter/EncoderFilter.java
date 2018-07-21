package com.springboot.demo.filter;

import org.apache.catalina.connector.RequestFacade;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter(filterName = "encodeFilter",urlPatterns = "/*")
public class EncoderFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("EncoderFilter init...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("EncoderFilter doFilter....");
        System.out.println(((RequestFacade) request).getRequestURL());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("EncoderFilter destroy...");
    }
}
