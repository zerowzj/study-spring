package test.study.spring.ioc.bean_factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean_factory.xml.XmlBean;

@Slf4j
public class XmlTest {

    private static final String CONFIG_LOCATION = "spring/spring-xml.xml";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        XmlBean xmlBean = (XmlBean) ctx.getBean("xmlBean");
        log.info("{}", xmlBean);

        //不显示close不执行destroy-method方法
        ctx.close();
    }
}
