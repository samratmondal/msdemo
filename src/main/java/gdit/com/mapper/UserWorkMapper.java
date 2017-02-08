package gdit.com.mapper;

import gdit.com.domain.UserWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by samratmondal on 2/6/17.
 */
@Mapper
public interface UserWorkMapper {

    @Select("Select User_Cntl_ID, Work_Type_ID from TMDMADM.BCRT09_User_Work_Tbl where User_Cntl_ID = '3974'")
    UserWork findByUserCntlId();
}
