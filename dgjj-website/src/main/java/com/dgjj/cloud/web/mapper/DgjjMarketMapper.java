package com.dgjj.cloud.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dgjj.cloud.web.dto.DgjjMarketDto;
import com.dgjj.cloud.web.form.DgjjMarketForm;

@Mapper
public interface DgjjMarketMapper {

	public List<DgjjMarketDto> findList(DgjjMarketForm form);

}
