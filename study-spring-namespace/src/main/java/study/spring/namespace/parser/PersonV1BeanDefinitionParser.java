package study.spring.namespace.parser;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.w3c.dom.Element;
import study.spring.namespace.Person;

public class PersonV1BeanDefinitionParser implements BeanDefinitionParser {

    @Override
    public BeanDefinition parse(Element element, ParserContext context) {
        //
        Object source = context.extractSource(element);
        //
        XmlReaderContext readerContext = context.getReaderContext();
        
        //定义Bean
        RootBeanDefinition bd = new RootBeanDefinition(Person.class);
        bd.setSource(source);
        bd.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
        bd.getPropertyValues().add("id", "cutesource11111111111");
        bd.getPropertyValues().add("name", "fdasfads");
        bd.getPropertyValues().add("age", "100");
        //注册Bean
        BeanDefinitionRegistry registry = readerContext.getRegistry();
        registry.registerBeanDefinition("cutesource", bd);

//        context.registerComponent(new BeanComponentDefinition(handlerMappingDef, ""));
//        context.popAndRegisterContainingComponent();
        return null;
    }
}
