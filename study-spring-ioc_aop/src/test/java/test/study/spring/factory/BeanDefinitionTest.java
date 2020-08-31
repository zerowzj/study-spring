package test.study.spring.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import study.spring.ioc.bean.MyConfigBean;

@Slf4j
public class BeanDefinitionTest {

    @Test
    public void test() {
        //bd定义
        AbstractBeanDefinition bd = new RootBeanDefinition();
        bd.setBeanClassName("study.spring.ioc.bean.MyConfigBean");
        log.info("is_lazy_init= {}", bd.isLazyInit());
        log.info("scope= {}", bd.getScope());
        //构造器注入
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
//        argumentValues.addIndexedArgumentValue();
//        argumentValues.addArgumentValues();
        //setter注入
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.add("name", "wangzhj");
        bd.setPropertyValues(propertyValues);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("myBean", bd);
        MyConfigBean myBean = (MyConfigBean) beanFactory.getBean("myBean");
        log.info("{}", myBean);
    }
}
