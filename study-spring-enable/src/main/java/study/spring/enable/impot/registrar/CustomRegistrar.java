package study.spring.enable.impot.registrar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import study.spring.enable.feign.EnableFeignClients;

import java.util.Map;

@Slf4j
public class CustomRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata,
                                        BeanDefinitionRegistry registry) {
        Map<String, Object> attrs = metadata.getAnnotationAttributes(EnableFeignClients.class.getName(), true);

        System.out.println("adsfasdfasdfasd"+attrs);
        log.info(">>>>>> {}", attrs);
        log.info(">>>>>> registerBeanDefinitions");
//        BeanDefinition bd = new RootBeanDefinition(ImportBean.class);
//        registry.registerBeanDefinition("importBean", bd);
    }
}
