package com.dgjj.cloud.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 大国技交用户协议外部链接
 *
 * @author bowen.zhang
 * @date 2018-09-03 15:13:42
 */
@Controller
public class DgjjOuterLinkController {

	@RequestMapping("/outer")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model){
	
	    return "outer";
	}
}
