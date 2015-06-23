package r2d2.sample.dashboard.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import r2d2.sample.dashboard.model.Grid;
import r2d2.sample.dashboard.model.GridContent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chanwook
 */
@Service
public class MockGridServiceImpl implements GridService {

    /**
     * 자바로 데이터 넘기도록 코딩.
     * //TODO DB + JPA로 변경하자
     *
     * @param pageRequest
     * @return
     */
    @Override
    public Grid findAll(Pageable pageRequest) {
        List<GridContent> list = new ArrayList<GridContent>();
        for (int i = 0; i < pageRequest.getPageSize(); i++) {
            GridContent c = new GridContent();
            c.put("system", "시스템" + i);
            c.put("service", "서비스" + i);
            c.put("api", i * 10);
            c.put("admin", "홍길동");
            list.add(c);
        }

        return new Grid(list);
    }
}
