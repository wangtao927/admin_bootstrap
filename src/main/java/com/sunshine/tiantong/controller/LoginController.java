package com.sunshine.tiantong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangtao on 2016/10/16.
 */

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    // 登录界面
    @RequestMapping("login")
    public String login() {

        logger.debug("login function");
        return "login";
    }

    @RequestMapping("loginAction")
    public ModelAndView loginAction() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }


}
