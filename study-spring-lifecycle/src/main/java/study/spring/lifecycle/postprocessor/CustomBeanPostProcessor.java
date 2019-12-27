package study.spring.lifecycle.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import study.spring.lifecycle.MyBean;

@Slf4j
public class CustomBeanPostProcessor implements BeanPostProcessor {

    public CustomBeanPostProcessor() {
        log.info("★ BeanPostProcessor===> 实例化");
    }

    /**
     * 初始化前
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            log.info("★ BeanPostProcessor===> postProcessBeforeInitialization");
        }
        return bean;
    }

    /**
     * 初始化后
     */
    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            log.info("★ BeanPostProcessor===> postProcessAfterInitialization");
        }
        return bean;
    }
}
