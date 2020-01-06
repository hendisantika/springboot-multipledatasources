package com.hendisantika.springbootmultipledatasources.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.41
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.hendisantika.springbootmultipledatasources.repository.member",
        entityManagerFactoryRef = "memberEntityManagerFactory",
        transactionManagerRef = "memberTransactionManager"
)
public class MemberDataSourceConfiguration {
}
