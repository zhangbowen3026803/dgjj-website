/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.dgjj.cloud.web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgjj.cloud.web.dto.DgjjMarketDto;
import com.dgjj.cloud.web.form.DgjjMarketForm;
import com.dgjj.cloud.web.mapper.DgjjMarketMapper;
import com.dgjj.cloud.web.service.DgjjMarketService;

@Service
public class DgjjMarketServiceImpl implements DgjjMarketService {

	@Autowired
	DgjjMarketMapper dgjjMarketMapper;
	
	@Override
	public List<DgjjMarketDto> findList(DgjjMarketForm form) {
		return dgjjMarketMapper.findList(form);
	}
	
	
}
