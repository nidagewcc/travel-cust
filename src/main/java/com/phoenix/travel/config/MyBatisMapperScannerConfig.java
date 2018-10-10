package com.phoenix.travel.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mapper扫描类
 *
 * @author Weishuo Zhang
 * @create 2018/10/10
 */
//@Configuration
//@AutoConfigureAfter(MybatisConfig.class)
public class MyBatisMapperScannerConfig {

    //@Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage("com.phoenix.travel.dao");
//        return mapperScannerConfigurer;
//    }
}
