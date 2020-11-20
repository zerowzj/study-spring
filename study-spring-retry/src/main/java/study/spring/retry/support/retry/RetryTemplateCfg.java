package study.spring.retry.support.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.backoff.ExponentialBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

/**
 * （★）
 * 1.引入 org.springframework.retry 依赖
 * 2.配置并使用 RetryTemplate
 * 3.使用 @EnableRetry 和 @Retryable
 */
@Slf4j
@Configuration
public class RetryTemplateCfg {

    @Bean
    public RetryTemplate retryTemplate() {
        RetryTemplate retryTemplate = new RetryTemplate();
        //重试策略
        SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy(5);
        retryTemplate.setRetryPolicy(retryPolicy);
        //补偿策略
        ExponentialBackOffPolicy backOffPolicy = new ExponentialBackOffPolicy();
        backOffPolicy.setInitialInterval(2000);
        backOffPolicy.setMultiplier(2);
        retryTemplate.setBackOffPolicy(backOffPolicy);
        //
//        retryTemplate.setListeners();
        //
//        retryTemplate.setThrowLastExceptionOnExhausted();
        //
//        retryTemplate.setRetryContextCache();

        return retryTemplate;
    }
}
