package br.com.tdv.playground.confs;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource("classpath:datasource-dev.properties")
@Profile("dev")
public class JpaConfigurationDev extends JpaConfiguration {
		
		@Value("${jdbc.url}")
		private String url;
		
		@Value("${jdbc.user}")
		private String user;
		
		@Value("${jdbc.password}")
		private String password;
		
		@Value("${hibernate.dialect}")
		private String dialect;
		
		@Value("${hibernate.show_sql}")
		private String showSql;
		
		@Value("${hibernate.hbm2ddl.autoDev}")
		private String hbm2ddl;
		
		@Value("${jdbc.driver}")
		private String driver;
	    
		@Bean(name="dsDesenv")
	    public DataSource dataSource() {
			ComboPooledDataSource cpds = new ComboPooledDataSource();
			try {
				cpds.setDriverClass(driver);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
			cpds.setJdbcUrl(url);
			cpds.setUser(user);
			cpds.setPassword(password);
			cpds.setMinPoolSize(3);
			cpds.setAcquireIncrement(3);
			cpds.setMaxPoolSize(20);
			cpds.setMaxStatements(180);
			return cpds;
	    }

	    @Bean
		public Properties additionalProperties() {
			Properties props = new Properties();
			props.setProperty("hibernate.dialect", dialect);
			props.setProperty("hibernate.show_sql", showSql);
			props.setProperty("hibernate.hbm2ddl.auto", hbm2ddl);
			return props;
		}
}
