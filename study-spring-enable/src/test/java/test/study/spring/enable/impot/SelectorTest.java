package test.study.spring.enable.impot;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import study.spring.enable.impot.ImportBean;
import study.spring.enable.impot.selector.CustomImportSelector;

@Import(CustomImportSelector.class)
public class SelectorTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SelectorTest.class);
        context.refresh();

        ImportBean bean = context.getBean(ImportBean.class);
        bean.sayHi();
    }
}
