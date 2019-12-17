package study.spring.dao.service.popedom;

import study.spring.dao.mapper.popedomfunction.PopedomFunctionEO;
import study.spring.dao.mapper.popedomrole.PopedomRoleEO;

public interface PopedomService {

    PopedomRoleEO getRole(Long prId);

    PopedomFunctionEO getFunction(Long pfId);
}
