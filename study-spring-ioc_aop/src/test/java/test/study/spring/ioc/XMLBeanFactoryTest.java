package test.study.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import study.spring.ioc.bean.MyBean;

@Slf4j
public class XMLBeanFactoryTest {

    String CONFIG_LOCATION = "spring/spring-config.xml";

    @Test
    public void test() {
        ClassPathResource resource = new ClassPathResource(CONFIG_LOCATION);
        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
    }

    @Test
    public void getBean_test() {
        ClassPathResource resource = new ClassPathResource(CONFIG_LOCATION);
        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
        MyBean myBean = (MyBean) beanFactory.getBean("myBean");
        log.info("{}", myBean);
    }
}
