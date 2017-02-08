package gdit.com.domain;

import java.io.Serializable;

/**
 * Created by samratmondal on 2/3/17.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userCntlId;
    private String rscUserId;

    public Long getUserCntlId() {
        return userCntlId;
    }

    public void setUserCntlId(Long userCntlId) {
        this.userCntlId = userCntlId;
    }

    public String getRscUserId() {
        return rscUserId;
    }

    public void setRscUserId(String rscUserId) {
        this.rscUserId = rscUserId;
    }
}
