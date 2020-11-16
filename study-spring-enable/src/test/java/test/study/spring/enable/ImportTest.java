package test.study.spring.enable;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.enable.improt.CustomBean;
import study.spring.enable.improt.ImportCfg;

public class ImportTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ImportCfg.class);
        context.refresh();

        CustomBean bean = context.getBean(CustomBean.class);
        bean.sayHi();
    }
}
