package study.spring.enable.impot.selector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import study.spring.enable.impot.ImportBean;

@Slf4j
public class CustomImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        log.info(">>>>>> ImportSelector");
        //要注册为 bd 的类全限定
        String[] classNames = new String[]{ImportBean.class.getName()};
        metadata.getAnnotationTypes()
                .forEach(e -> {
                    log.info("{}", e);
                });

        return classNames;
    }
}
