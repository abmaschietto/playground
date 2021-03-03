package br.com.tdv.playground.confs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import br.com.tdv.playground.exceptions.DataSourceNotFoundException;

@Configuration
@PropertySource("classpath:datasource.properties")
@Profile("prod")
public class JpaConfigurationProd extends JpaConfiguration {
	
		@Value("${hibernate.dialect}")
		private String dialect;
	    
		@Value("${hibernate.show_sql}")
		private String showSql;
	
		@Value("${hibernate.hbm2ddl.auto}")
		private String hbm2ddl;
	
	    @Bean(name="dsProducao")
	    public DataSource dataSource() {
	    	String tdvDatasource = System.getenv("TDV_DATASOURCE");
	    	if(tdvDatasource != null && !tdvDatasource.equals("")){
		    	JndiDataSourceLookup dataSource = new JndiDataSourceLookup();
			    dataSource.setResourceRef(true);
			    return dataSource.getDataSource(tdvDatasource);
	    	}
	    	throw new DataSourceNotFoundException("Data source não encontrado! Verifique se a variável de ambiente TDV_DATASOURCE está configurada em seu ambiente.");	    	
	    }

	    @Bean(name="additionalProperties")
		public Properties additionalProperties() {
			Properties props = new Properties();
			props.setProperty("hibernate.dialect", dialect);
			props.setProperty("hibernate.show_sql", showSql);
			props.setProperty("hibernate.hbm2ddl.auto", hbm2ddl);
			return props;
		}
}
