package test.study.spring.enable.enable;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.enable.enable.feign.FeignCfg;
import study.spring.enable.enable.server.EnableServer;
import study.spring.enable.enable.server.Server;

@EnableServer(type = Server.Type.HTTP)
public class ServerTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ServerTest.class);
        context.refresh();

        Server server = context.getBean(Server.class);
        server.start();
    }
}
