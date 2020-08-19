package study.spring.enable.impot;

import org.springframework.context.annotation.Import;

@Import({Cstm_Bean.class,
        Cstm_ImportSelector.class,
        Cstm_ImportBeanDefinitionRegistrar.class})
public class ImportCfg {

}
