package study.spring.lifecycle.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBean.class);


    public MyBean() {
        LOGGER.info("======>实例化");
    }

    @Override
    public void destroy() throws Exception {
        LOGGER.info("======>执行 DisposableBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("======>执行 InitializingBean.afterPropertiesSet()");
    }
}
