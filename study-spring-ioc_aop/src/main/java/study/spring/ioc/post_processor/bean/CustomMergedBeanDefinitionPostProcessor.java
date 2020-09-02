package study.spring.ioc.post_processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.Ordered;

@Slf4j
public class CustomMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        log.info(">>>>>> CustomMergedBeanDefinitionPostProcessor Post-processor after instance");
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        log.info(">>>>>> CustomMergedBeanDefinitionPostProcessor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("bbbbbbbbbbb");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("aaaaaa");
        return bean;
    }
}
