package test.study.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.MyConfigBean;
import study.spring.ioc.bean.MyLifecycleBean;

@Slf4j
public class ProcessorTest {

    @Test
    public void tesMyConfigBeant() throws Exception {
        String configLocation = "spring/spring-processor.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

        MyLifecycleBean myLifecycleBean = (MyLifecycleBean)ctx.getBean("myLifecycleBean");
        //不显示close不执行destroy-method方法
        ctx.close();
    }
}
