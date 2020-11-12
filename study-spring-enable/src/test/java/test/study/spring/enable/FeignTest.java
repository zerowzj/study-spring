package test.study.spring.enable;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.enable.enable.hello.HelloBean;
import study.spring.enable.enable.hello.HelloCfg;
import study.spring.enable.feign.FeignCfg;

public class FeignTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(FeignCfg.class);
        context.refresh();
    }
}
