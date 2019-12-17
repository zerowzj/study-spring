package study.sping.annotation.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:prop.properties")
public class CustomPropertiesCfg {

    /**
     * （★）application.yml和application.properties文件中属性
     */
    @Bean
    @ConfigurationProperties(prefix = "custom.application.demo1")
    public CustomProperties customProperties11() {
        return new CustomProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "custom.application.demo2")
    public CustomProperties customProperties12() {
        return new CustomProperties();
    }

    /**
     * （★）properties文件中属性
     * 注意：需要使用@PropertySource和@PropertySources显示引入properties文件
     */
    @Bean
    @ConfigurationProperties(prefix = "custom.prop.demo1")
    public CustomProperties customProperties21() {
        return new CustomProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "custom.prop.demo2")
    public CustomProperties customProperties22() {
        return new CustomProperties();
    }
}
