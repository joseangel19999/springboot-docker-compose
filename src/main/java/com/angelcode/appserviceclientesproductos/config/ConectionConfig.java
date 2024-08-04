package com.angelcode.appserviceclientesproductos.config;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


/*@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "appEntityManagerFactory",transactionManagerRef = "txtManager",basePackages = {"com.angelcode"})
@Component("com.angelcode")
public class ConectionConfig {

	private static final String FILE_PATH = "bd.properties";
	
	@Bean(name="appSecurityDatasource")
	@Scope("singleton")
	public DataSource datasource() {
		Properties prop= new Properties();
		HikariConfig hikariConfig= new HikariConfig();
//		hikariConfig.setJdbcUrl("jdbc:mysql://localhost/userservicve_app");
//		hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3307/prueba_test1");
//		hikariConfig.setJdbcUrl(getValue("bd.ip"));
		hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/prueba_test1");
		hikariConfig.setUsername("root");
//		hikariConfig.setPassword("joseadmin_");
		hikariConfig.setPassword("jose123");
		hikariConfig.setMaximumPoolSize(20);
		hikariConfig.setMinimumIdle(10);
		hikariConfig.setConnectionTimeout(5000);
		hikariConfig.setPoolName("POOL_APP_PRODUCT");
		HikariDataSource hikariDataSource= new HikariDataSource(hikariConfig);
		return hikariDataSource;
	}
	
	@Bean(name="appEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		HibernateJpaVendorAdapter vendorAdapter= new HibernateJpaVendorAdapter();
		vendorAdapter.setShowSql(true);
		vendorAdapter.setGenerateDdl(true);
		vendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean= new LocalContainerEntityManagerFactoryBean();
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
		localContainerEntityManagerFactoryBean.setPackagesToScan("com.angelcode.appserviceclientesproductos");
		localContainerEntityManagerFactoryBean.setDataSource(datasource());
		localContainerEntityManagerFactoryBean.setPersistenceUnitName("JPA_PU");
		return localContainerEntityManagerFactoryBean;
	}
	
	@Bean(name="txtManager")
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager txtManager= new JpaTransactionManager();
		txtManager.setEntityManagerFactory(entityManagerFactory);
		return txtManager;
	}
	
	private static String getValue(String name) {
		Properties prop = new Properties();
        try (InputStream resourceAsStream = Application.class.getClassLoader().getResourceAsStream(new URI(FILE_PATH).normalize().getPath())) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo de configuracion de BD : " + FILE_PATH);
        } catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
        	System.err.println("Error al cargar el archivo de configuracion de BD : " + FILE_PATH);
		}
		return prop.getProperty(name, "");
	}

}*/
