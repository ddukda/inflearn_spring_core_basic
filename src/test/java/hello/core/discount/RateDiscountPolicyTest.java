package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용")
    void vip_o() {
        Member member = new Member(1L, "memberA", Grade.VIP);

        int discount = discountPolicy.discount(member, 20000);

        assertThat(discount).isEqualTo(2000);
    }


    @Test
    @DisplayName("VIP가 아니면 할인 미적용")
    void vip_x() {
        Member member = new Member(1L, "memberB", Grade.BASIC);

        int discount = discountPolicy.discount(member, 20000);

        assertThat(discount).isEqualTo(0);
    }
}
