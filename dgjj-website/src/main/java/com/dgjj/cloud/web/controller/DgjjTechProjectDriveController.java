package com.dgjj.cloud.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dgjj.cloud.web.dto.DgjjMarketDto;
import com.dgjj.cloud.web.form.DgjjMarketForm;
import com.dgjj.cloud.web.service.DgjjMarketService;
/**
 * 大国技交技术驱动
 *
 * @author bowen.zhang
 * @date 2018-09-03 15:13:42
 */
@Controller
public class DgjjTechProjectDriveController {
	
	@Autowired
	DgjjMarketService dgjjMarketService;
	
	/**
	 * 首页
	 */
    @RequestMapping("/technology")
    public String technology(HttpServletRequest request, HttpServletResponse response, Model model){

    	DgjjMarketForm form = new DgjjMarketForm();
		List<DgjjMarketDto> list = dgjjMarketService.findList(form);
		model.addAttribute("list",list);
    		
        return "technology";
    }
}
