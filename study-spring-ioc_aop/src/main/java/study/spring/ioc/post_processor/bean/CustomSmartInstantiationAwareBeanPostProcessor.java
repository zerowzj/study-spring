package study.spring.ioc.post_processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.core.Ordered;

import java.lang.reflect.Constructor;

@Slf4j
public class CustomSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    /**
     * 预测Bean的类型，返回第一个预测成功的Class类型，如果不能预测返回null
     */
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        log.info(">>>>>> SmartInstantiationAwareBeanPostProcessor predictBeanType=="+ beanClass.getName());
        return beanClass;
    }

    /**
     * 选择合适的构造器，比如目标对象有多个构造器，在这里可以进行一些定制化，选择合适的构造器
     * beanClass参数表示目标实例的类型，beanName是目标实例在Spring容器中的name
     * 返回值是个构造器数组，如果返回null，会执行下一个PostProcessor的determineCandidateConstructors方法；
     * 否则选取该PostProcessor选择的构造器
     */
    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        log.info(">>>>>> SmartInstantiationAwareBeanPostProcessor determineCandidateConstructors");
        return null;
    }

    /**
     * 获得提前暴露的bean引用。主要用于解决循环引用的问题
     * 只有单例对象才会调用此方法
     */
    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> SmartInstantiationAwareBeanPostProcessor getEarlyBeanReference");
        return bean;
    }
}
