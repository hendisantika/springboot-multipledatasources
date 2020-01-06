package com.hendisantika.springbootmultipledatasources.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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
}
