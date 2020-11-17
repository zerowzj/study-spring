package study.spring.enable.impot.registrar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import study.spring.enable.impot.ImportBean;

@Slf4j
public class CustomRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata,
                                        BeanDefinitionRegistry registry) {
        log.info(">>>>>> ImportBeanDefinitionRegistrar");

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(ImportBean.class);
        BeanDefinition bd = builder.getBeanDefinition();
        registry.registerBeanDefinition(ImportBean.class.getName(), bd);
    }
}
