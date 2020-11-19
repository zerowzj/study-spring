package study.spring.tx.mapper.useradmin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import study.spring.tx.support.db.BaseEO;

import java.util.Date;

@Getter
@Setter
@ToString
public class UserBaseEO extends BaseEO {

    private Long ubId;

    private Long ubUserId;

    private String ubLoginName;

    private String ubLoginPwd;
    
    private Date ubBeginTime;
}
