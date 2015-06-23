package r2d2.sample.dashboard.service;

import org.springframework.data.domain.Pageable;
import r2d2.sample.dashboard.model.Grid;

/**
 * @author chanwook
 */
public interface GridService {
    Grid findAll(Pageable pageRequest);

}
