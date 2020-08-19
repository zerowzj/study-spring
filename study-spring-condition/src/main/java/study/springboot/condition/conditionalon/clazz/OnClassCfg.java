package study.springboot.condition.conditionalon.clazz;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.springboot.condition.conditionalon.bean.City;
import study.springboot.condition.conditionalon.bean.People;

@Configuration
public class OnClassCfg {

    @Bean
    public City city() {
        City city = new City();
        city.setName("海南岛");
        return city;
    }

    @Bean
    @ConditionalOnClass
    public People people(City city) {
        //这里如果city实体没有成功注入，这里就会报空指针
        city.setCode("222");
        return new People("大大", 30, city);
    }
}
