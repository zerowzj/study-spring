package test.study.spring.enable.impot;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import study.spring.enable.impot.ImportBean;
import study.spring.enable.impot.configuration.CustomConfigurationBean;


@Import(CustomConfigurationBean.class)
public class ConfigurationTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigurationTest.class);
        context.refresh();

        ImportBean bean = context.getBean(ImportBean.class);
        bean.sayHi();
    }
}
