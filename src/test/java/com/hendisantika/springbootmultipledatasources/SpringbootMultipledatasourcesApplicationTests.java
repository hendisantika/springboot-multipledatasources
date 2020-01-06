package com.hendisantika.springbootmultipledatasources;

import com.hendisantika.springbootmultipledatasources.model.card.Card;
import com.hendisantika.springbootmultipledatasources.model.cardholder.CardHolder;
import com.hendisantika.springbootmultipledatasources.model.member.Member;
import com.hendisantika.springbootmultipledatasources.repository.card.CardRepository;
import com.hendisantika.springbootmultipledatasources.repository.cardholder.CardHolderRepository;
import com.hendisantika.springbootmultipledatasources.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMultipledatasourcesApplicationTests {

    /*
     * We will be using mysql databases we configured in our properties file for our tests
     * Make sure your datasource connections are correct otherwise the test will fail
     * */

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private CardHolderRepository cardHolderRepository;

    @Autowired
    private CardRepository cardRepository;

    private Member member;
    private Card card;
    private CardHolder cardHolder;

}
