package test.study.spring.enable.impot;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import study.spring.enable.impot.ImportBean;

@Import(ImportBean.class)
public class ImportBeanTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ImportBeanTest.class);
        context.refresh();

        ImportBean bean = context.getBean(ImportBean.class);
        bean.sayHi();
    }
}
