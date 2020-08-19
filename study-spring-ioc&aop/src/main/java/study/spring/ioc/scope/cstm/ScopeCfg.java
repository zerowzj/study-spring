package study.spring.ioc.scope.cstm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
public class ScopeCfg {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer scopeCfg = new CustomScopeConfigurer();
        Map<String, Object> map = new HashMap<>();
        map.put("timeScope", new TimeScope());
        scopeCfg.setScopes(map);
        return scopeCfg;
    }

//    @Bean
//    @Scope(value = "timeScope", proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public TimeScopeBean timeScopeBean() {
//        TimeScopeBean timeScopeBean = new TimeScopeBean();
//        timeScopeBean.setCurrentTime(System.currentTimeMillis());
//        log.info("time scope bean");
//        return timeScopeBean;
//    }
}
