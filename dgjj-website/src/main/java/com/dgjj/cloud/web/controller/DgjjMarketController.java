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

@Controller
public class DgjjMarketController {
	
	@Autowired
	DgjjMarketService dgjjMarketService;
	
	@RequestMapping("/market")
	public String market(HttpServletRequest request, HttpServletResponse response, Model model){
		
		DgjjMarketForm form = new DgjjMarketForm();
		List<DgjjMarketDto> list = dgjjMarketService.findList(form);
		model.addAttribute("list",list);
		
	    return "market";
	}
}
