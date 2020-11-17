package study.spring.ioc.bean_factory_post_processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * 1.修改 Bean 属性
 */
@Slf4j
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 9;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info(">>>>>> postProcessBeanFactory");
    }

    private void tt(ConfigurableListableBeanFactory beanFactory) {
        BeanDefinition definition = beanFactory.getBeanDefinition("MyBean#0");
        MutablePropertyValues pv = definition.getPropertyValues();
        pv.add("name", "这是新增加的测试值");
    }
}
