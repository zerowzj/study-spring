package study.spring.namespace.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import study.spring.namespace.parser.PersonV1BeanDefinitionParser;

public class DubboNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("person", new PersonV1BeanDefinitionParser());
    }
}
