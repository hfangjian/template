package com.ctg.service;

import com.ctg.common.ServerResponse;
import com.ctg.vo.DemoVO;
import com.github.pagehelper.Page;

/**
 * Created by hfangjian on 2017/6/30.
 */
public interface IDemoService {

    ServerResponse<Page> listDemo(DemoVO demoVO);

}
