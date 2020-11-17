package test.study.spring.ioc.factory_bean;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean_factory.xml.XmlBean;

@Slf4j
public class FactoryBeanTest {

    String CONFIG_LOCATION = "spring/spring-factory_bean.xml";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        XmlBean xmlBean = (XmlBean) ctx.getBean(XmlBean.class);
        //不显示close不执行destroy-method方法
        ctx.close();
    }
}
