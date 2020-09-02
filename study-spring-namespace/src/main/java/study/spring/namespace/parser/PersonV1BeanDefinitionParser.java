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
        RootBeanDefinition bd = new RootBeanDefinition();
        bd.setBeanClass(Person.class);
        bd.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
        if(element.hasAttribute("id")){
            bd.getPropertyValues().add("id", element.getAttribute("id"));
        }
        if(element.hasAttribute("name")){
            bd.getPropertyValues().add("name", element.getAttribute("name"));
        }
        if(element.hasAttribute("age")){
            bd.getPropertyValues().add("age", element.getAttribute("age"));
        }

        //注册Bean
        BeanDefinitionRegistry registry = readerContext.getRegistry();
        registry.registerBeanDefinition("cutesource", bd);

//        context.registerComponent(new BeanComponentDefinition(handlerMappingDef, ""));
//        context.popAndRegisterContainingComponent();
        return null;
    }
}
