package study.springboot.condition.enable.bye;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class ByeImportSelector implements ImportSelector, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        log.info("===> ByeImportSelector");
        importingClassMetadata.getAnnotationTypes()
                .forEach(e -> {
                    log.info("{}", e);
                });
        log.info("{}", applicationContext);
        return new String[]{ByeBean.class.getName()};
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
