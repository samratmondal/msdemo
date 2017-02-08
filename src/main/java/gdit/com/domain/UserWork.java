package gdit.com.domain;

import java.io.Serializable;

/**
 * Created by samratmondal on 2/6/17.
 */
public class UserWork implements Serializable {

    private static final long serialVersionUID = 2L;

    private Long userCntlId;
    private String workTypeId;

    public Long getUserCntlId() {
        return userCntlId;
    }

    public void setUserCntlId(Long userCntlId) {
        this.userCntlId = userCntlId;
    }

    public String getWorkTypeId() {
        return workTypeId;
    }

    public void setWorkTypeId(String workTypeId) {
        this.workTypeId = workTypeId;
    }
}
