package r2d2.sample.dashboard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author chanwook
 */
public interface GridService {
    Grid findAll(Pageable pageRequest);

}
