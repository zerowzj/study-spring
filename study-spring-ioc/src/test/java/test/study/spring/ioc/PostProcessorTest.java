package test.study.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.LifecycleBean;

@Slf4j
public class PostProcessorTest {

    @Test
    public void test() {
        String configLocation = "spring/spring-post_processor.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

        LifecycleBean lifecycleBean = (LifecycleBean)ctx.getBean("lifecycleBean");
        //不显示close不执行destroy-method方法
        ctx.close();
    }
}