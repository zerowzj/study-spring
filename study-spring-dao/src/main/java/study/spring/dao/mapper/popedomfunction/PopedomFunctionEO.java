package study.spring.dao.mapper.popedomfunction;

import org.apache.ibatis.type.Alias;
import study.spring.dao.support.db.BaseEO;

@Alias("PopedomFunctionEO")
public class PopedomFunctionEO extends BaseEO {

    /* 功能编号 */
    private Long pfId;
    /* 功能名称 */
    private String pfName;

    public Long getPfId() {
        return pfId;
    }

    public void setPfId(Long pfId) {
        this.pfId = pfId;
    }

    public String getPfName() {
        return pfName;
    }

    public void setPfName(String pfName) {
        this.pfName = pfName;
    }
}
