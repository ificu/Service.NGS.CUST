package com.wh.pjtr.NGS.CUST.mapper.Common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wh.pjtr.NGS.CUST.model.Common.TestVO;

@Mapper
public interface ITestMapper {
	
	List<TestVO> selectTestList();
	List<TestVO> selectTestListById(String reqId);
	
}
