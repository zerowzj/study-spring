package study.spring.lifecycle.postprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import study.spring.lifecycle.MyBean;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomBeanPostProcessor.class);

    public CustomBeanPostProcessor() {
        LOGGER.info("★ BeanPostProcessor===> 实例化");
    }

    /**
     * 初始化前
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            LOGGER.info("★ BeanPostProcessor===> postProcessBeforeInitialization");
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
            LOGGER.info("★ BeanPostProcessor===> postProcessAfterInitialization");
        }
        return bean;
    }
}
