package com.dgjj.cloud.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 大国技交首页
 *
 * @author bowen.zhang
 * @date 2018-09-03 15:13:42
 */
@Controller
public class DgjjIndexController {

	 /**
	 * 首页
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model){
	
	    return "index";
	}
    
   
   @RequestMapping("/indexlistdescription1")
   public String indexlistdescription1(HttpServletRequest request, HttpServletResponse response, Model model){

       return "indexlistdescription1";
   }
    
    
}
