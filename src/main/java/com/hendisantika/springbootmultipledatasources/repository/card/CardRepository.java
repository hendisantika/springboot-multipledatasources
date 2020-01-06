package com.hendisantika.springbootmultipledatasources.repository.card;

import com.hendisantika.springbootmultipledatasources.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.34
 */
public interface CardRepository extends JpaRepository<Card, Long> {
}