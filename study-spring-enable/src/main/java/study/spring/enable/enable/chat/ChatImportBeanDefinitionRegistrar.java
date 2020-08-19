package study.spring.enable.enable.chat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class ChatImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        log.info("===> ChatImportBeanDefinitionRegistrar");
        //创建构建器对象
        BeanDefinitionBuilder bdBuilder = BeanDefinitionBuilder.rootBeanDefinition(ChatBean.class);
        BeanDefinition bd = bdBuilder.getBeanDefinition();
        registry.registerBeanDefinition(ChatBean.class.getName(), bd);
    }
}
