package com.example.spring_demo;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author huzijie
 * @version ErrorBean.java, v 0.1 2024年06月20日 14:21 huzijie Exp $
 */
public class ErrorBean implements Filter, jakarta.servlet.Filter {

    public ErrorBean() {
        System.out.println("error Bean");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void doFilter(jakarta.servlet.ServletRequest request, jakarta.servlet.ServletResponse response, jakarta.servlet.FilterChain chain) throws IOException, jakarta.servlet.ServletException {

    }

    @Override
    public void destroy() {

    }
}
