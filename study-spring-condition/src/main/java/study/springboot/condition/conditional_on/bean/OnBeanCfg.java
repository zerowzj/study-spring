package study.springboot.condition.conditional_on.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OnBeanCfg {

    @Bean("city1")
    public City city1() {
        City city = new City();
        city.setName("千岛湖");
        return city;
    }

    @Bean
    @ConditionalOnBean(name="city")
    public People people(City city) {
        //这里如果city实体没有成功注入，这里就会报空指针
        city.setCode("111");
        return new People("小小", 3, city);
    }
}
