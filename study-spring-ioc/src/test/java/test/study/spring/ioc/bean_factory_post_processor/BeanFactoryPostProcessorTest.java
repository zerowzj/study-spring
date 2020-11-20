package test.study.spring.ioc.bean_factory_post_processor;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean_factory.bean.XmlBean;

@Slf4j
public class BeanFactoryPostProcessorTest {

    String CONFIG_LOCATION = "spring/spring-bean_factory_post_processor.bean";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        XmlBean xmlBean = (XmlBean) ctx.getBean("xmlBean");
        //不显示close不执行destroy-method方法
        ctx.close();
    }
}
