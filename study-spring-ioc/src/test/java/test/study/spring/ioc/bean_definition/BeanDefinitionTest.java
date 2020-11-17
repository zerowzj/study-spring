package test.study.spring.ioc.bean_definition;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import study.spring.ioc.bean_definition.MyBean;

@Slf4j
public class BeanDefinitionTest {

    @Test
    public void constructor_test() {
        //bd定义
        AbstractBeanDefinition bd = new RootBeanDefinition();

        //类型
        bd.setBeanClass(MyBean.class);
        //bd.setBeanClassName("study.spring.ioc.bean_defin.MyConfigBean");
        //constructor注入
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addIndexedArgumentValue(0, "wangzhj");
        bd.setConstructorArgumentValues(argumentValues);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("myBean", bd);
        MyBean myBean = (MyBean) beanFactory.getBean("myBean");
        log.info("{}", myBean);
    }

    @Test
    public void set_test(){
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyBean.class);
        builder.addPropertyValue("name", "haha");

        BeanDefinition bd = builder.getBeanDefinition();

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("myBean", bd);
        MyBean myBean = (MyBean) beanFactory.getBean("myBean");
        log.info("{}", myBean);
    }
}
