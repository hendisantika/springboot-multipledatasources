package com.hendisantika.springbootmultipledatasources.repository.cardholder;

import com.hendisantika.springbootmultipledatasources.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.36
 */
public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}