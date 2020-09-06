package com.wh.pjtr.NGS.CUST.service.Common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wh.pjtr.NGS.CUST.mapper.Common.ITestMapper;
import com.wh.pjtr.NGS.CUST.model.Common.TestVO;

@Service
@Transactional
public class TestService {
	
	@Autowired
	ITestMapper testMapper;
	
	public List<TestVO> selectTestList() throws Exception {
		return testMapper.selectTestList();
	}
	
	public List<TestVO> selectTestListById(String reqId) throws Exception {
		return testMapper.selectTestListById(reqId);
	}

}
