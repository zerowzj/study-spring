package study.spring.ioc.processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

@Slf4j
public class CustomMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

    public CustomMergedBeanDefinitionPostProcessor(){
        log.info(">>>>>>实例化CutmMergedBeanDefinitionPostProcessor");
    }

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        log.info(beanName);
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        log.info(beanName);
    }

    //**************以下实现
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
