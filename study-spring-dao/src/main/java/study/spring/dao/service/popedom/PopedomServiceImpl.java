package study.spring.dao.service.popedom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.spring.dao.mapper.popedomfunction.PopedomFunctionDao;
import study.spring.dao.mapper.popedomfunction.PopedomFunctionEO;
import study.spring.dao.mapper.popedomrole.PopedomRoleDao;
import study.spring.dao.mapper.popedomrole.PopedomRoleEO;

import javax.sql.DataSource;
import java.util.List;

@Service("popedomService")
public class PopedomServiceImpl implements PopedomService {

    @Autowired
    private List<DataSource> dataSources;
    @Autowired
    private PopedomRoleDao popedomRoleDao;
    @Autowired
    private PopedomFunctionDao popedomFunctionDao;

    @Override
    public PopedomRoleEO getRole(Long prId) {
        return popedomRoleDao.get(prId);
    }

    @Override
    public PopedomFunctionEO getFunction(Long pfId) {
        int a =200;
        return popedomFunctionDao.get(pfId);
    }
}
