//package project.tutorfinding.configuration;
//import javax.sql.DataSource;
//import javax.validation.Valid;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.annotation.Order;
//import org.springframework.core.io.Resource;
//import org.springframework.jdbc.datasource.init.DataSourceInitializer;
//import org.springframework.jdbc.datasource.init.DatabasePopulator;
//import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//@EntityScan("project.tutorfinding.domain")
//@EnableTransactionManagement
//@PropertySource("classpath:application.properties")
//public class AppConfig {
//    @Value("${spring.datasource.driverClassName}")
//    String driverClassName;
//
//    @Value("${spring.datasource.url}")
//    String url;
//
//    @Value("${spring.datasource.username}")
//    String username;
//
//    @Value("${spring.datasource.password}")
//    String password;
//
//    // schema script
//
//    @Value("classpath:data.sql")
//    private Resource schemaScript;
//
//    @Value("classpath:data.sql")
//    private Resource dataScript;
//
//    // bean : data source config
////    @Bean(name = "dataSource")
////    public DataSource getDataSource() {
////        DataSource dataSource = DataSourceBuilder
////                .create()
////                .username(username)
////                .password(password)
////                .url(url)
////                .driverClassName(driverClassName)
////                .build();
////        return dataSource;
////    }
////
////    // session factory config
////    @Bean(name = "sessionFactory")
////    public SessionFactory getSessionFactory(@Qualifier("dataSource") DataSource dataSource) {
////        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
////        sessionBuilder.scanPackages("project.tutorfinding.domain");
////        return sessionBuilder.buildSessionFactory();
////    }
////
////
////    @Bean(name = "transactionManager")
////    public HibernateTransactionManager getTransactionManager(
////            SessionFactory sessionFactory) {
////        HibernateTransactionManager transactionManager = new HibernateTransactionManager(
////                sessionFactory);
////        return transactionManager;
////    }
////
////    @Bean
////    public DataSourceInitializer dataSourceInitializer(final @Qualifier("dataSource") DataSource dataSource) {
////        final DataSourceInitializer initializer = new DataSourceInitializer();
////        initializer.setDataSource(dataSource);
////        initializer.setDatabasePopulator(databasePopulator());
////        return initializer;
////    }
////
////    private DatabasePopulator databasePopulator() {
////        final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
////        populator.addScript(schemaScript);
////        populator.addScript(dataScript);
////        return populator;
////    }
//
//}
