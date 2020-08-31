package study.spring.ioc.processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

@Slf4j
public class CustomDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {

    @Override
    public boolean requiresDestruction(Object bean) {
        log.info(">>>>>> ");
        return false;
    }

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> ");
    }
}
