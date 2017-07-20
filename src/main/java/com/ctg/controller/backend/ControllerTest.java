package com.ctg.controller.backend;

import com.ctg.common.ServerResponse;
import com.ctg.service.IDemoService;
import com.ctg.vo.DemoVO;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hfangjian on 2017/6/30.
 */
@Controller
@RequestMapping("/test")
public class ControllerTest {

    @Autowired
    IDemoService iDemoService;

    @RequestMapping("/page_help")
    @ResponseBody
    public ServerResponse<Page> getList(DemoVO demoVO){
        return iDemoService.listDemo(demoVO);
    }
}
