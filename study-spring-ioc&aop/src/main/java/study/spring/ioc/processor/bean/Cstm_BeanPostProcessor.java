package study.spring.ioc.processor.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import study.spring.ioc.processor.MyBean;

/**
 * Bean初始化前后，即执行以下方法前后
 * （1）@PostConstruct
 * （2）实现InitializingBean
 * （3）
 */
@Slf4j
@Component
public class Cstm_BeanPostProcessor implements BeanPostProcessor {

    public Cstm_BeanPostProcessor() {
        log.info(">>>>>> 实例化 BeanPostProcessor");
    }

    /**
     * ====================
     * 初始化前
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (!(bean instanceof MyBean)) {
            return bean;
        }
        log.info(">>>>>> 初始化前处理");
        return bean;
    }

    /**
     * 初始化后
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (!(bean instanceof MyBean)) {
            return bean;
        }
        log.info(">>>>>> 初始化后处理");
        return bean;
    }
}
