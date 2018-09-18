package com.dgjj.cloud.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 大国技交技术驱动
 *
 * @author bowen.zhang
 * @date 2018-09-03 15:13:42
 */
@Controller
public class DgjjTechProjectDriveController {
	
	/**
	 * 首页
	 */
    @RequestMapping("/technology")
    public String technology(HttpServletRequest request, HttpServletResponse response, Model model){

        return "technology";
    }
}
