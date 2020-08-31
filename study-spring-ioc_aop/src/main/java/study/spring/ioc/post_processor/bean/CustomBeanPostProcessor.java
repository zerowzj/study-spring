package study.spring.ioc.post_processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * 该处初始化指以下方法
 * （1）@PostConstruct注解的方法
 * （2）实现InitializingBean的
 * （3）init-method指定的方法
 */
@Slf4j
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 1000;
    }

    public CustomBeanPostProcessor() {
        //log.info(">>>>>> 实例化 BeanPostProcessor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> BeanPostProcessor Post-process before initialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>> BeanPostProcessor Post-process after initialization");
        return bean;
    }
}
