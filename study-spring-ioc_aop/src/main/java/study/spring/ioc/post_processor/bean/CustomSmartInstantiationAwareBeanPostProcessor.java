package study.spring.ioc.post_processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

@Slf4j
public class CustomSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        log.info(">>>>>> SmartInstantiationAwareBeanPostProcessor predictBeanType");
        return beanClass;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        log.info(">>>>>> SmartInstantiationAwareBeanPostProcessor determineCandidateConstructors");
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> SmartInstantiationAwareBeanPostProcessor getEarlyBeanReference");
        return bean;
    }
}
