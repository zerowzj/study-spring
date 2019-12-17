package study.spring.dao.mapper.popedomrole;

import org.apache.ibatis.type.Alias;
import study.spring.dao.support.db.BaseEO;

@Alias("PopedomRoleEO")
public class PopedomRoleEO extends BaseEO {

    /* 角色编号 */
    private Long prId;
    /* 角色名称 */
    private String prName;

    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }
}
