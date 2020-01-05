package net.cone.backendapp.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"net.cone.backendapp.dto"})
@EnableTransactionManagement
public class ConnectionConfig {
	
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/proyecto_conectividad";
	private final static String DATABASE_DIRVER = "com.mysql.jdbc.Driver";
	private final static String DATABASE_DIALECT = "";
	private final static String DATABASE_USERNAME = "root";
	private final static String DATABASE_PASSWORD = "";
	
	@Bean
	public static DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DIRVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
	}

}
