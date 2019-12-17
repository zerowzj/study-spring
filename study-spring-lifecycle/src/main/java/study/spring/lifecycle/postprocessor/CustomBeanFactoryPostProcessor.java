package study.spring.lifecycle.postprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomBeanFactoryPostProcessor.class);

    public CustomBeanFactoryPostProcessor() {
        LOGGER.info("■ BeanFactoryPostProcessor===>实例化");
        LOGGER.info("====================");
        LOGGER.info("实例化");
        LOGGER.info("====================");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        BeanDefinition definition = beanFactory.getBeanDefinition("MyBean#0");
//        MutablePropertyValues pv = definition.getPropertyValues();
//        pv.add("name", "这是新增加的测试值");
        //如果
//        MyBean extBean = beanFactory.getBean(MyBean.class);
        LOGGER.info("■ BeanFactoryPostProcessor===>postProcessBeanFactory()");
        LOGGER.info("====================");
        LOGGER.info("实例化");
        LOGGER.info("====================");
    }
}
