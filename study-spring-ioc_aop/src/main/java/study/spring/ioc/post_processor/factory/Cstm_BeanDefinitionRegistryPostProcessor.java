package study.spring.ioc.post_processor.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Cstm_BeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    public Cstm_BeanDefinitionRegistryPostProcessor() {
        log.info(">>>>>> 实例化 BeanDefinitionRegistryPostProcessor");
    }

    /**
     * 所有Bean定义将要被加载，Bean实例还未创建的时候运行，它优先于postProcessBeanFactory方法执行
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //（★）
        int bdCount = registry.getBeanDefinitionCount();
        String[] bdNames = registry.getBeanDefinitionNames();
        //（★）
        BeanDefinition bd = registry.getBeanDefinition("");
        //（★）
        boolean contain = registry.containsBeanDefinition("");
        //（★）
        registry.registerBeanDefinition("", null);

        log.info(">>>>>> 执行 BeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info(">>>>>> 执行 BeanFactory的postProcessBeanFactory");
    }
}
