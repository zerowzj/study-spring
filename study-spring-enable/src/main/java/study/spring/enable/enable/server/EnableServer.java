package study.spring.enable.enable.server;

import org.springframework.context.annotation.Import;
import study.spring.enable.enable.server.selector.ServerImportSelector;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@Import(ServerImportSelector.class)
//@Import(ServerImportBeanDefinitionRegistrar.class)
public @interface EnableServer {

    Server.Type type();
}
