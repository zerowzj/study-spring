package study.spring.namespace.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import study.spring.namespace.parser.DemoBeanDefinitionParser;

public class PersonNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("person", new DemoBeanDefinitionParser());
    }
}
