//package test.study.spring.ioc.bean_definition;
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//import study.spring.ioc.bean.ConfigBean;
//
//@Slf4j
//public class BeanDefinitionReaderTest {
//
//    @Test
//    public void test() {
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions("classpath:spring/spring-configuration.xml");
//
//        ConfigBean myConfigBean = (ConfigBean) beanFactory.getBean("myConfigBean");
//        log.info("{}", myConfigBean);
//    }
//}
