package test.study.spring.ioc.bean_factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Slf4j
public class XmlBeanFactoryTest {

    String CONFIG_LOCATION = "spring/spring-bean.bean";

    @Test
    public void test() {
        Resource resource = new ClassPathResource(CONFIG_LOCATION);
        BeanFactory factory = new XmlBeanFactory(resource);
        log.info(">>>>>>");
        factory.getBean("xmlBean");
    }
}
