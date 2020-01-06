package com.hendisantika.springbootmultipledatasources.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.39
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.hendisantika.springbootmultipledatasources.repository.cardholder",
        entityManagerFactoryRef = "cardHolderEntityManagerFactory",
        transactionManagerRef = "cardHolderTransactionManager")
public class CardHolderDataSourceConfiguration {
    @Bean
    @ConfigurationProperties("app.datasource.cardholder")
    public DataSourceProperties cardHolderDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.cardholder.configuration")
    public DataSource cardholderDataSource() {
        return cardHolderDataSourceProperties().initializeDataSourceBuilder()
                .type(BasicDataSource.class).build();
    }

}
