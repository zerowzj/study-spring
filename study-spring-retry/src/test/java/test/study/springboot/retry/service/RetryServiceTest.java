package test.study.springboot.retry.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.springboot.retry.service.RetryService;
import study.springboot.retry.support.SpringBootCfg;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootCfg.class})
public class RetryServiceTest {

    @Autowired
    private RetryService retryService;

    @Test
    public void retryByCode_test() {
        retryService.retryByCode();
    }

    @Test
    public void retryByAnnot_test() {
        retryService.retryByAnnot();
    }
}
