package com.MobiShop.MobiShopBackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.MobiShop.MobiShopBackend.dao.*;
import com.MobiShop.MobiShopBackend.model.*;

@Configuration
@ComponentScan("com.MobiShop.MobiShopBackend")
@EnableTransactionManagement
public class ApplicationConfig {
	
	private SessionFactory sessionFactory;
	public DataSource getH2DataSource()
	{
		System.out.println("Data Source Method");
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/MyDB");
		dataSource.setUsername("user1");
		dataSource.setPassword("user1");
		
		System.out.println("Data Source Created");
		return dataSource;
	}
	public Properties getHibernateProperties()
	{
		System.out.println("Hibernate Properties -Entered");
		
		Properties hibernate_prop = new Properties();
		hibernate_prop.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernate_prop.put("hibernate.show_sql", "true");
		hibernate_prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	
		System.out.println("Hibernate Property Object Created");
		return hibernate_prop;
	}
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		System.out.println("SessionFacotry Method -Enterted");
		
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(User.class);
		SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
		
		System.out.println("SessionFactory Object Created");
		return sessionFactory;
	}
	@Bean(name="productDAO")
	public ProductDAO getProductDAO(SessionFactory sessionFactory)
	{
		return new ProductDAO(sessionFactory);
	}
	 @Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO(SessionFactory sessionFactory)
	{
		return new CategoryDAO(sessionFactory);
	}
	 
	 @Bean(name="supplierDAO")
	 public SupplierDAO getSupplierDAO(SessionFactory sessionFactory)
	 {
		 return new SupplierDAO(sessionFactory);
	 }
	 
	 @Bean(name="userDAO")
	 public UserDAO getUserDAO(SessionFactory sessionFactory)
	 {
		 return new UserDAO(sessionFactory);
	 }
	
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("Transaction Manager");
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
}

