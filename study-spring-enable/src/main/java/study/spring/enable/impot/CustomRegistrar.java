package study.spring.enable.impot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class CustomRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata,
                                        BeanDefinitionRegistry registry) {
        log.info(">>>>>> registerBeanDefinitions");
//        BeanDefinition bd = new RootBeanDefinition(ImportBean.class);
//        registry.registerBeanDefinition("importBean", bd);
    }
}
