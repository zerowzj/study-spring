package study.spring.enable.impot.selector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class CustomImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        log.info(">>>>>> selectImports");
        return new String[0];
    }
}
