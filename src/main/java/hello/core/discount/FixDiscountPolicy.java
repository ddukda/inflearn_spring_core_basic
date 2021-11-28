package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    private int discoutFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade().equals(Grade.VIP)) {
            return discoutFixAmount;
        } else {
            return 0;
        }
    }
}
