package r2d2.sample.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import r2.dustjs.spring.DustModel;
import r2d2.sample.dashboard.model.Grid;
import r2d2.sample.dashboard.service.GridService;

/**
 * @author chanwook
 */
@Controller
public class DashboardController {

    @Autowired
    private GridService gridService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/dashboard")
    public String dashboard(Pageable pageRequest, DustModel model) {
        //TODO 서비스 예제 추가
        Grid grid = gridService.findAll(pageRequest);
        model.put("grid", grid);
        return "dashboard";
    }
}
