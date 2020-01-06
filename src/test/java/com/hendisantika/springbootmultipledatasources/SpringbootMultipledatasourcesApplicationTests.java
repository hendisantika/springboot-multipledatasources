package com.hendisantika.springbootmultipledatasources;

import com.hendisantika.springbootmultipledatasources.model.card.Card;
import com.hendisantika.springbootmultipledatasources.model.cardholder.CardHolder;
import com.hendisantika.springbootmultipledatasources.model.member.Member;
import com.hendisantika.springbootmultipledatasources.repository.card.CardRepository;
import com.hendisantika.springbootmultipledatasources.repository.cardholder.CardHolderRepository;
import com.hendisantika.springbootmultipledatasources.repository.member.MemberRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
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

    @Before
    public void initializeDataObjects() {

        member = new Member();
        member.setMemberId("M001");
        member.setName("Uzumaki Naruto");

        cardHolder = new CardHolder();
        cardHolder.setCardNumber("4111111111111111");
        cardHolder.setMemberId(member.getMemberId());

        card = new Card();
        card.setExpirationMonth(01);
        card.setExpirationYear(2020);
        card.setName(member.getName());

    }

    @Test
    public void shouldSaveMemberToMemberDB() {
        Member savedMember = memberRepository.save(member);
        Optional<Member> memberFromDb = memberRepository.findById(savedMember.getId());
        assertTrue(memberFromDb.isPresent());
    }

}
