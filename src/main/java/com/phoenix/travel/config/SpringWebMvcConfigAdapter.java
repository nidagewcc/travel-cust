package com.phoenix.travel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Weishuo Zhang
 * @create 2018/10/10
 */
@Configuration
public class SpringWebMvcConfigAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // TODO
        //super.addInterceptors(registry);
    }
}
