/*
 * package com.paymentservice.config;
 * 
 * import java.util.Properties;
 * 
 * import javax.persistence.EntityManagerFactory; import javax.sql.DataSource;
 * 
 * import org.springframework.boot.context.properties.ConfigurationProperties;
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.data.jpa.repository.config.EnableJpaRepositories; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource; import
 * org.springframework.orm.jpa.JpaTransactionManager; import
 * org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean; import
 * org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter; import
 * org.springframework.transaction.PlatformTransactionManager; import
 * org.springframework.transaction.annotation.EnableTransactionManagement;
 * 
 * @Configuration
 * 
 * @EnableJpaRepositories("com.paymentservice.dao")
 * 
 * @EnableTransactionManagement
 * 
 * @ComponentScan("com.paymentservice") public class PersistanceContext {
 * 
 * 
 * method to define dataSorce for postgres instance
 * 
 * @Bean
 * 
 * @ConfigurationProperties(prefix = "spring.datasource") public DataSource
 * datasource() { DriverManagerDataSource dataSource = new
 * DriverManagerDataSource(); return dataSource; }
 * 
 * method to define entity manager for postgres instance
 * 
 * 
 * @Bean public EntityManagerFactory entityManagerFactory() {
 * HibernateJpaVendorAdapter adaptor = new HibernateJpaVendorAdapter();
 * 
 * Properties properties = new Properties();
 * properties.setProperty("hibernate.dialect",
 * "org.hibernate.dialect.PostreSQLDialect");
 * properties.setProperty("javax.persistance.validation.mode", "none");
 * 
 * LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new
 * LocalContainerEntityManagerFactoryBean();
 * entityManagerFactoryBean.setDataSource(datasource());
 * entityManagerFactoryBean.setPackagesToScan("com.paymentservice");
 * entityManagerFactoryBean.setJpaProperties(properties);
 * entityManagerFactoryBean.setJpaVendorAdapter(adaptor);
 * entityManagerFactoryBean.afterPropertiesSet(); return
 * entityManagerFactoryBean.getObject();
 * 
 * }
 * 
 * method to define PlatformTransactionManager
 * 
 * @Bean public PlatformTransactionManager transactionManager() {
 * JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
 * jpaTransactionManager.setEntityManagerFactory(entityManagerFactory()); return
 * jpaTransactionManager ; }
 * 
 * }
 */