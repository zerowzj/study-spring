package test.study.spring.enable.impot;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import study.spring.enable.impot.ImportBean;
import study.spring.enable.impot.registrar.CustomRegistrar;

@Import(CustomRegistrar.class)
public class RegistrarTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(RegistrarTest.class);
        context.refresh();

        ImportBean bean = context.getBean(ImportBean.class);
        bean.sayHi();
    }
}
