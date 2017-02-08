package gdit.com.mapper;

import gdit.com.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by samratmondal on 2/3/17.
 */
@Mapper
public interface UserMapper {

    @Select("Select RSC_User_ID from DBA$DB1V.REM_User where User_Cntl_ID = '4746'")
    User findByUserCntlId();
}
