package study.spring.enable.impot.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.spring.enable.impot.ImportBean;

@Slf4j
@Configuration
public class CustomConfigurationBean {

    @Bean
    public ImportBean importBean() {
        log.info(">>>>>> @Configuration");
        return new ImportBean();
    }
}
