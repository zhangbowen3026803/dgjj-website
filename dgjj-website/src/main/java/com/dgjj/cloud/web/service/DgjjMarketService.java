package com.dgjj.cloud.web.service;

import java.util.List;

import com.dgjj.cloud.web.dto.DgjjMarketDto;
import com.dgjj.cloud.web.form.DgjjMarketForm;
/**
 * 用户
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:22:06
 */
public interface DgjjMarketService {

	List<DgjjMarketDto> findList(DgjjMarketForm form);
	
	
}
