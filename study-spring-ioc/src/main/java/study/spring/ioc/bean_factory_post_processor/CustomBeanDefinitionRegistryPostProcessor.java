package study.spring.ioc.bean_factory_post_processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;

import java.util.Arrays;

/**
 * 1.
 * 2.
 */
@Slf4j
public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    /**
     * 1.所有 Bean 定义被加载，Bean 实例还未创建的时候运行
     * 2.它优先于 postProcessBeanFactory 方法执行
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //获取 bd 数量
        int bdCount = registry.getBeanDefinitionCount();
        log.info(">>>>>> bd_count= {}", bdCount);
        //获取 bd 名称
        String[] bdNames = registry.getBeanDefinitionNames();
        Arrays.stream(bdNames).forEach(e -> {
            log.info(">>>>>> {}", e);
        });
        //是否包含 bd
        boolean isContain = registry.containsBeanDefinition("11");
        if (isContain) {
            //获取 bd
            registry.getBeanDefinition("111");
        }
        //注册 bd
        registry.registerBeanDefinition("ABC", null);

        log.info(">>>>>> postProcessBeanDefinitionRegistry");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info(">>>>>> postProcessBeanFactory");
    }
}
