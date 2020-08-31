package study.spring.ioc.processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * Bean实例化前后，即Bean的构造函数执行前后
 */
@Slf4j
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor, Ordered {

    public CustomInstantiationAwareBeanPostProcessor() {
        log.info(">>>>>> 实例化InstantiationAwareBeanPostProcessor");
    }

    @Override
    public int getOrder() {
        return 1000;
    }

    /**
     * =================
     * 实例化
     * =================
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        log.info("123213");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        log.info("1111");
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        log.info("21212");
        return null;
    }

    /**
     * **************************************
     * 以下是继承BeanPostProcessor
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>>InstantiationAwareBeanPostProcessor 初始化前的后置处理");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>>InstantiationAwareBeanPostProcessor 初始化后的后置处理");
        return bean;
    }
}
