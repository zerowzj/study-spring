package study.spring.namespace.parser;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.w3c.dom.Element;
import study.spring.namespace.Person;

public class DemoBeanDefinitionParser implements BeanDefinitionParser {

    @Override
    public BeanDefinition parse(Element element, ParserContext context) {
        //
        Object source = context.extractSource(element);
        //
        XmlReaderContext readerContext = context.getReaderContext();
        //定义Bean
        RootBeanDefinition handlerMappingDef = new RootBeanDefinition(Person.class);
        handlerMappingDef.setSource(source);
        handlerMappingDef.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
        handlerMappingDef.getPropertyValues().add("id", "cutesource");
        handlerMappingDef.getPropertyValues().add("name", "fdasfads");
        handlerMappingDef.getPropertyValues().add("age", "100");
        //
        BeanDefinitionRegistry registry = readerContext.getRegistry();
        registry.registerBeanDefinition("cutesource", handlerMappingDef);

//        context.registerComponent(new BeanComponentDefinition(handlerMappingDef, ""));
//        context.popAndRegisterContainingComponent();
        return null;
    }
}
