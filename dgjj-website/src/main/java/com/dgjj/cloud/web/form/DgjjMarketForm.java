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

package com.dgjj.cloud.web.form;

/**
 * 大盘查询表单
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.1.0 2018-01-25
 */
public class DgjjMarketForm {
	
	/**
	 * 大盘ID
	 */
	private String marketId;

	/**
	 * 技术名称
	 */
	private String techName;
    /**
	 * 技术领域
	 */
	private String techArea;
    /**
	 * 驱动人数排序标识
	 */
	private String conFlg;
    /**
	 * 驱动现额排序标识
	 */
	private String cashFlg;
    /**
	 * 用户ID
	 */
	private String userId;
    
    /**
	 * 设置： 大盘ID
	 */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	/**
	 * 获取： 大盘ID
	 */
	public String getMarketId() {
		return marketId;
	}
    
    /**
	 * 设置： 技术领域
	 */
	public void setTechArea(String techArea) {
		this.techArea = techArea;
	}
	/**
	 * 获取： 技术领域
	 */
	public String getTechArea() {
		return techArea;
	}

	/**
	 * 设置：技术名称
	 */
	public void setTechName(String techName) {
		this.techName = techName;
	}
	/**
	 * 获取：技术名称
	 */
	public String getTechName() {
		return techName;
	}
	/**
	 * 设置：驱动人数排序标识
	 */
	public void setConFlg(String conFlg) {
		this.conFlg = conFlg;
	}
	/**
	 * 获取：驱动人数排序标识
	 */
	public String getConFlg() {
		return conFlg;
	}
	/**
	 * 设置：驱动现额排序标识
	 */
	public void setCashFlg(String cashFlg) {
		this.cashFlg = cashFlg;
	}
	/**
	 * 获取：驱动现额排序标识
	 */
	public String getCashFlg() {
		return cashFlg;
	}
	/**
	 * 设置： 用户ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取： 用户ID
	 */
	public String getUserId() {
		return userId;
	}
	
}
