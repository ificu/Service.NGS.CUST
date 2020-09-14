package com.wh.pjtr.ngs.cust.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wh.pjtr.ngs.cust.sample.model.SampleVO;

@Mapper
public interface SampleMapper {
	List<SampleVO> selectSampleList();
	List<SampleVO> selectSampleListById(String reqId);
}
