package study.spring.tx.mapper.useradmin;

import study.spring.tx.support.db.BaseMapper;

import java.util.List;

public interface UserBaseMapper extends BaseMapper<Long, UserBaseEO> {

    List<UserBaseEO> getUserLt();
}
