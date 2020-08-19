package test.study.annotation.spring;

import org.junit.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.enable.impot.Cstm_Bean;
import study.spring.enable.impot.ImportCfg;

@EnableAutoConfiguration
public class ImportTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ImportCfg.class);
        context.refresh();

        Cstm_Bean bean = context.getBean(Cstm_Bean.class);
        bean.sayHi();
    }
}
