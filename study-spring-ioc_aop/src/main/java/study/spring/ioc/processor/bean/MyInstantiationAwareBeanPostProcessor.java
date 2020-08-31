package study.spring.ioc.processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.core.Ordered;

import java.util.Arrays;

/**
 * Bean实例化前后，即Bean的构造函数执行前后
 */
@Slf4j
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor, Ordered {

    public MyInstantiationAwareBeanPostProcessor() {
        //log.info(">>>>>> 实例化InstantiationAwareBeanPostProcessor");
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        log.info(">>>>>> InstantiationAwareBeanPostProcessor2 实例化前的后处理");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> InstantiationAwareBeanPostProcessor2 实例化后的后处理");
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        log.info(">>>>>> InstantiationAwareBeanPostProcessor2 set注入之前的后处理");
        Arrays.stream(pvs.getPropertyValues()).forEach(e -> {
            log.info("{}= {}", e.getName(), e.getValue());
        });
        return pvs;
    }
}
