package test.study.spring.enable.enable;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.enable.enable.feign.FeignCfg;

public class FeignTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(FeignCfg.class);
        context.refresh();
    }
}
