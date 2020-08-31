package study.spring.ioc.post_processor.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Slf4j
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public CustomBeanFactoryPostProcessor() {
        log.info(">>>>>> 实例化 BeanFactory前处理");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        BeanDefinition definition = beanFactory.getBeanDefinition("MyBean#0");
//        MutablePropertyValues pv = definition.getPropertyValues();
//        pv.add("name", "这是新增加的测试值");
        //如果
//        MyBean extBean = beanFactory.getBean(MyBean.class);
        log.info(">>>>>> 执行 BeanFactory的postProcessBeanFactory");
    }
}
