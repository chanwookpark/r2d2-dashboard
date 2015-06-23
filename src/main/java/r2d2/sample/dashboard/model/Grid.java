package r2d2.sample.dashboard.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chanwook
 */
public class Grid {

    private List<GridContent> contentList = new ArrayList<GridContent>();

    public Grid() {
    }

    public Grid(GridContent... contents) {
        contentList.addAll(Arrays.asList(contents));
    }

    public Grid(List<GridContent> list) {
        this.contentList = list;
    }

    public List<GridContent> getContentList() {
        return contentList;
    }

    public void setContentList(List<GridContent> contentList) {
        this.contentList = contentList;
    }
}
