package com.hendisantika.springbootmultipledatasources.repository.member;

import com.hendisantika.springbootmultipledatasources.model.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-multipledatasources
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/01/20
 * Time: 06.37
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}