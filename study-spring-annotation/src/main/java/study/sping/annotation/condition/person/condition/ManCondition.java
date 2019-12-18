package study.sping.annotation.condition.person.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ManCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata) {
        //bean工厂，可以获取容器中的所有bean
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取当前环境信息
        Environment environment = context.getEnvironment();
        //获取bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        //获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //资源信息
        ResourceLoader resourceLoader = context.getResourceLoader();
        return true;
    }
}
