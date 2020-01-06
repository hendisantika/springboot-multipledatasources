package com.hendisantika.springbootmultipledatasources.controller;

import com.hendisantika.springbootmultipledatasources.model.card.Card;
import com.hendisantika.springbootmultipledatasources.repository.card.CardRepository;
import com.hendisantika.springbootmultipledatasources.repository.cardholder.CardHolderRepository;
import com.hendisantika.springbootmultipledatasources.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.55
 */

@RestController
@RequestMapping("/api/all")
public class AllController {
    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private CardHolderRepository cardHolderRepository;

    @Autowired
    private MemberRepository memberRepository;
}
