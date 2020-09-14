package com.wh.pjtr.ngs.cust.sample.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wh.pjtr.ngs.cust.sample.mapper.SampleMapper;
import com.wh.pjtr.ngs.cust.sample.model.SampleVO;

@RequiredArgsConstructor
@Service
@Transactional
public class SampleService {
	private final SampleMapper sampleMapper;
	
	public List<SampleVO> selectTestList() throws Exception {
		return sampleMapper.selectSampleList();
	}
	
	public List<SampleVO> selectTestListById(String reqId) throws Exception {
		return sampleMapper.selectSampleListById(reqId);
	}

}
