package study.spring.namespace.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import study.spring.namespace.Person;

public class PersonV2BeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Person.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        if (StringUtils.hasText(id)) {
            builder.addPropertyValue("id", id);
        }
        String name = element.getAttribute("name");
        if (StringUtils.hasText(name)) {
            builder.addPropertyValue("name", name);
        }
        String age = element.getAttribute("age");
        if (StringUtils.hasText(age)) {
            builder.addPropertyValue("age", Integer.valueOf(age));
        }
    }
}
