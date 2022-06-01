package com.ihorizons.migration.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.ihorizons.migration.persistence.repositories"}
)
@EntityScan(basePackages = {"com.ihorizons.migration.persistence"})
public class MySqlDBConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public JndiPropertyHolder primary() {
        return new JndiPropertyHolder();
    }

    @ConfigurationProperties("spring.datasource")
    @Primary
    @Bean(name = "mainDataSource")
    public HikariDataSource dataSource(DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().type(HikariDataSource.class)
                .build();
    }
    @Primary
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("mainDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.ihorizons.migration.persistence.db")
                .build();
    }

    @Primary
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
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
