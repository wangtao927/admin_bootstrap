package com.sunshine.tiantong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangtao on 2016/10/15.
 */

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("getTest")
    public String test() {
        return "test";
    }
}
