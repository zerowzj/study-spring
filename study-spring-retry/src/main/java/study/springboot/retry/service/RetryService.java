package study.springboot.retry.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Slf4j
@Service("retryService")
public class RetryService {

    @Autowired
    private RetryTemplate retryTemplate;

    public String retryByCode() {
        String msg = retryTemplate.execute((context) -> {
            context.getRetryCount();
            log.info(">>>>>>>>>> retry start: {} {}", LocalDate.now(), LocalTime.now());
            if (1 == 1) {
                throw new RuntimeException("超时异常");
            }
            return "ok";
        });
        return msg;
    }

    @Retryable(value = {Exception.class},
            maxAttempts = 3,
            backoff = @Backoff(delay = 2000, multiplier = 2))
    public void retryByAnnot() {
        log.info(">>>>>>>>>> retry start: {} {}", LocalDate.now(), LocalTime.now());
        if (1 == 1) {
            throw new RuntimeException("超时异常");
        }
    }
}
