package study.springboot.retry.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

//重试
@EnableRetry
//
@SpringBootApplication(scanBasePackages = "study.springboot.retry")
public class SpringBootCfg {

}
