package study.sping.annotation.enable;

import org.springframework.context.annotation.Configuration;
import study.sping.annotation.enable.hello.EnableHello;
import study.sping.annotation.enable.server.EnableServer;
import study.sping.annotation.enable.server.Server;

@EnableServer(type = Server.Type.HTTP)
@EnableHello
@Configuration
public class SpringEnableCfg {
}
