package okestro.okestrospring;

import okestro.okestrospring.repository.MemberRepository;
import okestro.okestrospring.repository.MemoryMemberRepository;
import okestro.okestrospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
