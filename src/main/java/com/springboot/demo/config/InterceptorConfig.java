package com.springboot.demo.config;


import com.springboot.demo.interceptor.FirstInterceptor;
import com.springboot.demo.interceptor.SecondInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new SecondInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
