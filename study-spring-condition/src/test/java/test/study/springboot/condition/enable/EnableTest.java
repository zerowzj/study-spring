package test.study.springboot.condition.enable;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;
import study.springboot.condition.enable.bye.ByeBean;
import study.springboot.condition.enable.bye.EnableBye;
import study.springboot.condition.enable.chat.ChatBean;
import study.springboot.condition.enable.chat.EnableChat;
import study.springboot.condition.enable.hello.EnableHello;
import study.springboot.condition.enable.hello.HelloBean;
import study.springboot.condition.enable.hello.HiBean;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootApplication(scanBasePackages = "study.springboot.condition")

@EnableHello
@EnableBye
@EnableChat
public class EnableTest {

    @Autowired
    private HelloBean helloBean;
    @Autowired
    private HiBean hiBean;

    @Autowired
    private ByeBean byeBean;

    @Autowired
    private ChatBean chatBean;

    @Test
    public void helloBean_test() {
        helloBean.sayHello();
        hiBean.sayHi();
    }

    @Test
    public void byeBean_test() {
        byeBean.sayBye();
    }

    @Test
    public void chatBean_test() {
        chatBean.chat();
    }
}