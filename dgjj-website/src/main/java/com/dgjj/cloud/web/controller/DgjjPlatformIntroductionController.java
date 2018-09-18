package com.dgjj.cloud.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 大国技交平台简介
 *
 * @author bowen.zhang
 * @date 2018-09-03 15:13:42
 */
@Controller
public class DgjjPlatformIntroductionController {
	
	/**
	 * 首页
	 */
    @RequestMapping("/introduction")
    public String introduction(HttpServletRequest request, HttpServletResponse response, Model model){

        return "introduction";
    }
}
