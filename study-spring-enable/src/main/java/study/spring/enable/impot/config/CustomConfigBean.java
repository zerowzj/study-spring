package study.spring.enable.impot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.enable.impot.ImportBean;

@Slf4j
@Configuration
public class CustomConfigBean {

    @Bean
    public ImportBean importBean() {
        return new ImportBean();
    }
}
