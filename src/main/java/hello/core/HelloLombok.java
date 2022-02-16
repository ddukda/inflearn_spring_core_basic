package hello.core;


import hello.core.member.Grade;
import hello.core.member.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;
    private List<Map<String, String>> list = Arrays.asList(Map.of("1", "양진호", "2", "이미경"));
    private List<Member> list2 = Arrays.asList(new Member(1L, "양진호", Grade.VIP), new Member(2L, "이미경", Grade.BASIC));

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(1);
        helloLombok.setName("test");

        System.out.println("helloLombok = " + helloLombok);
    }

}
