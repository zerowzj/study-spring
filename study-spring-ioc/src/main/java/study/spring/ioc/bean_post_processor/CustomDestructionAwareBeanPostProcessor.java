package study.spring.ioc.bean_post_processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * 实例化 Bean 后处理
 */
@Slf4j
public class CustomDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public boolean requiresDestruction(Object bean) {
        //log.info(">>>>>> ");
        return true;
    }

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> postProcessBeforeDestruction");
    }



    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> postProcessAfterInitialization");
        return bean;
    }
}
