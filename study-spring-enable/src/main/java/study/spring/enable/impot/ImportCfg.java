package study.spring.enable.impot;

import org.springframework.context.annotation.Import;

@Import({
        CustomBean.class,
//        CustomCfgBean.class,
//        CustomImportSelector.class,
//        CustomRegistrar.class,
})
public class ImportCfg {

}
