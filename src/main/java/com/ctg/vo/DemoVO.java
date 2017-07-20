package com.ctg.vo;

import com.ctg.pojo.Category;
import com.ctg.pojo.Demo;

/**
 * Created by hfangjian on 2017/6/30.
 */
public class DemoVO extends Demo{

    private Integer pageSize;

    private Integer pageIndex;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
}
