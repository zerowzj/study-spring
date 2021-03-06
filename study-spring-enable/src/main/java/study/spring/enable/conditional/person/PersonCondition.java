package study.spring.enable.conditional.person;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Slf4j
public class PersonCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        log.info("sadfsfasdfsadfdasf");
        //获取IOC使用的BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取Bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        //获取当前环境信息
        Environment environment = context.getEnvironment();
        String enabled = environment.getProperty("person.enabled");
        if (enabled.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }
}
