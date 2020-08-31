package study.spring.ioc.post_processor.bean;

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
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor, Ordered {

    public CustomInstantiationAwareBeanPostProcessor() {
        //log.info(">>>>>> 实例化InstantiationAwareBeanPostProcessor");
    }

    @Override
    public int getOrder() {
        return 10;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        log.info(">>>>>> InstantiationAwareBeanPostProcessor Post-process before instantiation"+ beanName);
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> InstantiationAwareBeanPostProcessor Post-process after instantiation");
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        log.info(">>>>>> InstantiationAwareBeanPostProcessor Post-process before setter");
        Arrays.stream(pvs.getPropertyValues()).forEach(e -> {
            log.info("{}= {}", e.getName(), e.getConvertedValue());
        });
        return pvs;
    }
}