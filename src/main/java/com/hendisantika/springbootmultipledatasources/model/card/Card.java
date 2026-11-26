package com.hendisantika.springbootmultipledatasources.model.card;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.32
 */
@Entity
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int expirationMonth;
    private int expirationYear;
}