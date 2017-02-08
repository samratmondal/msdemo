package gdit.com;

import gdit.com.domain.User;
import gdit.com.domain.UserWork;
import gdit.com.mapper.UserMapper;
import gdit.com.mapper.UserWorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * Created by samratmondal on 1/24/17.
 */
@RestController
@RequestMapping("/api")
@ConfigurationProperties(prefix="mbi")
public class BMIToHCINConverter {

/*
    @Autowired
    @Qualifier("cobJdbcTemplate")
    private JdbcTemplate cobTemplate;
*/

    //final private UserMapper userMapper;

    /*public BMIToHCINConverter(UserMapper userMapper) {
        this.userMapper = userMapper;
    }*/

    final private UserWorkMapper userWorkMapper;

    public BMIToHCINConverter(UserWorkMapper userWorkMapper) {
        this.userWorkMapper = userWorkMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hcinForMBI",
            produces = "application/json")
    public String hcinForMBI(String MBI) {
        String hostname = null;

        try {
            hostname = Inet4Address.getLocalHost().getHostAddress();

            //User user = userMapper.findByUserCntlId();
            UserWork userwork = userWorkMapper.findByUserCntlId();
            System.out.print("****** " + userwork.getWorkTypeId());
            System.out.print("****** " + userwork.getUserCntlId());
            hostname.concat(userwork.getWorkTypeId());

        } catch (UnknownHostException e) {
            e.printStackTrace();
            hostname = "unknown";
        }

        /*
            Don't laugh. This is meant to be a demo. The actual code needs
            to add the real implementation.
         */
        return "HCIN for MBI " + hostname;
    }
}
