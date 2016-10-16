package com.sunshine.tiantong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangtao on 2016/10/16.
 */

@Controller
public class MainController {

    // 主界面
    @RequestMapping("main")

    public String main() {


        return "main";
    }
}
