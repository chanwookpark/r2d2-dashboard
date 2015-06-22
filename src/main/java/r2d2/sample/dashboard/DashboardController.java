package r2d2.sample.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import r2.dustjs.spring.DustModel;

/**
 * @author chanwook
 */
@Controller
public class DashboardController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/dashboard")
    public String dashboard(DustModel model) {
        return "dashboard";
    }
}
