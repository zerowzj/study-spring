package study.spring.ioc.processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
import study.spring.ioc.processor.MyBean;

/**
 * Bean实例化前后，即Bean的构造函数执行前后
 */
@Slf4j
//@Component
public class Cstm_InstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    public Cstm_InstantiationAwareBeanPostProcessor() {
        log.info(">>>>>> 实例化 InstantiationAwareBeanPostProcessor");
    }

    /**
     * =================
     * 实例化
     * =================
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass == MyBean.class) {
            log.info(">>>>>> 执行InstantiationAwareBeanPostProcessor的postProcessBeforeInstantiation");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            log.info(">>>>>> 执行InstantiationAwareBeanPostProcessor的postProcessAfterInstantiation");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        return null;
    }

    /**
     * =================
     * 初始化
     * =================
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            log.info("AAAAAAAAAAAAAAA");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            log.info("BBBBBBBBBBBBBBBB");
        }
        return bean;
    }
}
