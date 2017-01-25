package gdit.com;

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
public class BMIToHCINConverter {

    @RequestMapping(method = RequestMethod.GET, value = "/hcinForMBI", produces = "text/plain")
    public String hcinForMBI(String MBI) {
        String hostname = null;

        try {
            hostname = Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            hostname = "unknown";
        }

        /*
            Don't laugh. This is meant to be a demo. The actiual code needs
            to add the real implementation.
         */
        return "HCIN for MBI " + hostname;
    }
}
