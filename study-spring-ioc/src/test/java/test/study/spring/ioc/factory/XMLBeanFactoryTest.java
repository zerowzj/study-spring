package test.study.spring.ioc.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import study.spring.ioc.bean.ConfigBean;

import java.util.concurrent.TimeUnit;

@Slf4j
public class XMLBeanFactoryTest {

    private static final String CONFIG_LOCATION = "spring/spring-config.xml";

    @Test
    public void test() throws Exception{
        ClassPathResource resource = new ClassPathResource(CONFIG_LOCATION);
        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);

        log.info("容器启动完成");

        //
        TimeUnit.SECONDS.sleep(5);
        ConfigBean myBean = (ConfigBean) beanFactory.getBean("myConfigBean");
        log.info("{}", myBean);
    }
}
