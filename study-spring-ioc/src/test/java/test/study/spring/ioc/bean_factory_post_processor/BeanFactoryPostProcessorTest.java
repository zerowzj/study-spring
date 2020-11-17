package test.study.spring.ioc.bean_factory_post_processor;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean_factory.xml.XmlBean;

@Slf4j
public class BeanFactoryPostProcessorTest {

    String CONFIG_LOCATION = "spring/spring-bean_factory_post_processor.xml";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        XmlBean lifecycleBean = (XmlBean) ctx.getBean("lifecycleBean");
        //不显示close不执行destroy-method方法
        ctx.close();
    }
}
