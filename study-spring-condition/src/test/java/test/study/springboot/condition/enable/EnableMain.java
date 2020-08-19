package test.study.springboot.condition.enable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import study.springboot.condition.enable.bye.ByeBean;
import study.springboot.condition.enable.bye.EnableBye;

@Configuration
@EnableBye
public class EnableMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnableMain.class);
        ByeBean byeBean = context.getBean(ByeBean.class);
        byeBean.sayBye();
    }
}
