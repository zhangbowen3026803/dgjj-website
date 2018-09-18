package com.dgjj.cloud.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 大国技交新闻中心
 *
 * @author bowen.zhang
 * @date 2018-09-03 15:13:42
 */
@Controller
public class DgjjNewsController {
	
	/**
	 * 新闻中心
	 */
    @RequestMapping("/indexnewslist")
    public String indexnewslist(HttpServletRequest request, HttpServletResponse response, Model model){

        return "indexnewslist";
    }
    
    @RequestMapping("/news")
    public String news(HttpServletRequest request, HttpServletResponse response, Model model){

        return "news";
    }
    
    @RequestMapping("/newsDescription1")
    public String newsDescription1(HttpServletRequest request, HttpServletResponse response, Model model){

        return "newsDescription1";
    }
    
    @RequestMapping("/newsDescription2")
    public String newsDescription2(HttpServletRequest request, HttpServletResponse response, Model model){

        return "newsDescription2";
    }
    
    @RequestMapping("/newsDescription3")
    public String newsDescription3(HttpServletRequest request, HttpServletResponse response, Model model){

        return "newsDescription3";
    }
    
    @RequestMapping("/newsDescription4")
    public String newsDescription4(HttpServletRequest request, HttpServletResponse response, Model model){

        return "newsDescription4";
    }
    
    @RequestMapping("/newsDescription5")
    public String newsDescription5(HttpServletRequest request, HttpServletResponse response, Model model){

        return "newsDescription5";
    }
    
    @RequestMapping("/newsDescription6")
    public String newsDescription6(HttpServletRequest request, HttpServletResponse response, Model model){

        return "newsDescription6";
    }
    
    @RequestMapping("/newsDescription7")
    public String newsDescription7(HttpServletRequest request, HttpServletResponse response, Model model){

        return "newsDescription7";
    }
    
}
