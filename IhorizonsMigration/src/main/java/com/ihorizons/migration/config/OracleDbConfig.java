package com.ihorizons.migration.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "secondaryEntityManagerFactory",
        transactionManagerRef = "secondaryTransactionManager",
        basePackages = {"com.ihorizons.migration.persistence.newrepositories"})
public class OracleDbConfig {


    @Bean
    @ConfigurationProperties(prefix = "spring.second-datasource")
    public JndiPropertyHolder secondary() {
        return new JndiPropertyHolder();
    }

    @Bean(name = "secondaryDataSource")
   @ConfigurationProperties(prefix = "spring.second-datasource")
    public DataSource dataSource() {
// use server JNDI connection
//        JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//        return dataSourceLookup.getDataSource(secondary().getJndiName());
// use local JDBC connection
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean secondaryEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                                @Qualifier("secondaryDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource)
               .packages("com.ihorizons.migration.persistence.newdb")
               .build();
    }

    @Bean(name = "secondaryTransactionManager")
    public PlatformTransactionManager secondaryTransactionManager(@Qualifier("secondaryEntityManagerFactory") EntityManagerFactory secondaryEntityManagerFactory) {
        return new JpaTransactionManager(secondaryEntityManagerFactory);
    }


    private static class JndiPropertyHolder {
        private String jndiName;

        public String getJndiName() {
            return jndiName;
        }

        public void setJndiName(String jndiName) {
            this.jndiName = jndiName;
        }
    }

}
