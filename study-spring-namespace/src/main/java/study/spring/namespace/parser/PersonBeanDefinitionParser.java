package study.spring.namespace.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import study.spring.namespace.Person;

public class PersonBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Person.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");
        String id = element.getAttribute("id");
        if (StringUtils.hasText(id)) {
            builder.addPropertyValue("id", id);
        }
        if (StringUtils.hasText(name)) {
            builder.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(age)) {
            builder.addPropertyValue("age", Integer.valueOf(age));
        }
    }
}