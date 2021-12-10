package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // AppConfig 제외, configuration 어노테이션에 component 존재
)
public class AutoAppConfig {


    // 자동빈이 있고 수동빈이 있으면, 수동빈이 우선, 자동빈을 오버라이딩 해버림)
//     `

}
