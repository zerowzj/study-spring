package study.spring.enable.impot;

import org.springframework.context.annotation.Import;

@Import({
        ImportBean.class,
//        CustomCfgBean.class,
//        CustomImportSelector.class,
//        CustomRegistrar.class,
})
public class ImportCfg {

}
