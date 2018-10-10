package com.phoenix.travel.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * session配置
 *
 * @author Weishuo Zhang
 * @create 2018/10/10
 */
@Configuration
public class SessionConfig {

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return container -> {

            //单位为S
            container.setSessionTimeout(1800);
        };
    }
}
