package test.study.spring.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import study.spring.ioc.bean.MyConfigBean;

@Slf4j
public class BeanDefinitionReaderTest {

    @Test
    public void test() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring/spring-config.xml");

        MyConfigBean myConfigBean = (MyConfigBean)beanFactory.getBean("myConfigBean");
        log.info("{}", myConfigBean);
    }
}
