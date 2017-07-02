package com.ctg.service.impl;

import com.ctg.common.ServerResponse;
import com.ctg.dao.CategoryMapper;
import com.ctg.pojo.Demo;
import com.ctg.service.IDemoService;
import com.ctg.vo.DemoVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hfangjian on 2017/6/30.
 */
@Service("iDemoService")
public class DemoServiceImpl implements IDemoService{

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public ServerResponse<Page> listDemo(DemoVO demoVO) {
        PageHelper.startPage(demoVO.getPageIndex()+1,demoVO.getPageSize());
        List<Demo> list = categoryMapper.listDemo();
        Page pageList = (Page)list;
        return ServerResponse.createBySuccess(pageList);
    }
}
