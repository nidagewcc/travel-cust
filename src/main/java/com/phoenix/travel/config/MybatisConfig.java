package com.phoenix.travel.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class MybatisConfig implements TransactionManagementConfigurer {
    Logger logger = LoggerFactory.getLogger(MybatisConfig.class);
    private final String MYBATIS_PAGEHELPER_REASONABLE = "reasonable";
    private final String MYBATIS_PAGEHELPER_SUPPORT_METHODS_ARGUMENTS = "supportMethodsArguments";
    private final String MYBATIS_PAGEHELPER_RETURN_PAGEINFO = "returnPageInfo";
    private final String MYBATIS_PAGEHELPER_PARAMS = "params";
    @Autowired
    DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(@Value("${mybatis.mapper-locations}") String mapperPath) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty(MYBATIS_PAGEHELPER_REASONABLE, "true");
        properties.setProperty(MYBATIS_PAGEHELPER_SUPPORT_METHODS_ARGUMENTS, "true");
        properties.setProperty(MYBATIS_PAGEHELPER_RETURN_PAGEINFO, "check");
        properties.setProperty(MYBATIS_PAGEHELPER_PARAMS, "count=countSql");
        properties.setProperty("dialect", "mysql");
        pageHelper.setProperties(properties);
        //添加插件
        bean.setPlugins(new Interceptor[]{pageHelper});
        //添加xml目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources(mapperPath));
            return bean.getObject();
        } catch (IOException e) {
            logger.error("系统配置异常！", e);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("系统异常！", e);
            throw new RuntimeException(e);
        }
        return null;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
