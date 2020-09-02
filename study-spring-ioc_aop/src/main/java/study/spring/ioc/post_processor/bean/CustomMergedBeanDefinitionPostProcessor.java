package study.spring.ioc.post_processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

@Slf4j
public class CustomMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        log.info(">>>>>> CustomMergedBeanDefinitionPostProcessor Post-processor after instance");
    }

    @Override
    public void resetBeanDefinition(String beanName) {
        log.info(">>>>>> CustomMergedBeanDefinitionPostProcessor");
    }
}
