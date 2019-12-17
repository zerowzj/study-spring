package study.study.spring.dao.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import study.spring.dao.mapper.popedomfunction.PopedomFunctionEO;
import study.spring.dao.mapper.popedomrole.PopedomRoleEO;
import study.spring.dao.service.popedom.PopedomService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-**.xml"})
public class PopedomServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PopedomServiceTest.class);

    @Autowired
    private PopedomService popedomService;

    @Test
    public void getRoleTest() {
        PopedomRoleEO prEO = popedomService.getRole(1L);
        LOGGER.info("===>{}", prEO.getPrName());
    }

    @Test
    public void getFunctionTest() {
        PopedomFunctionEO pfEO = popedomService.getFunction(1L);
        LOGGER.info("===>{}", pfEO.getPfName());
    }
}
