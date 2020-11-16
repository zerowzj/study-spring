package study.spring.enable.impot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class CustomCfgBean {

    @Bean
    public CustomBean customBean() {
        return new CustomBean();
    }
}
