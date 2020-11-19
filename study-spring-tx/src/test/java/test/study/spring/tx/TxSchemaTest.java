package test.study.spring.tx;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class TxSchemaTest {

    String CONFIG_LOCATION = "spring/spring-tx-schema.xml";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    }
}
