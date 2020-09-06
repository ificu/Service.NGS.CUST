package com.wh.pjtr.NGS.CUST.controller.Common;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.uiadapter17.spring.core.NexacroException;
import com.nexacro.uiadapter17.spring.core.annotation.ParamDataSet;
import com.nexacro.uiadapter17.spring.core.annotation.ParamVariable;
import com.nexacro.uiadapter17.spring.core.data.NexacroResult;
import com.wh.pjtr.NGS.CUST.model.Common.TestVO;
import com.wh.pjtr.NGS.CUST.service.Common.TestService;


@RestController
@RequestMapping("/Test")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/getTestData")
	public List<TestVO> getTestData(){
		try {
			return testService.selectTestList();
		}
		catch(Exception ex) {
			System.out.print(ex.getMessage());
			return null;
		}
	}
	
	@PostMapping("/nxTestData") 
	//public NexacroResult nxTestData(@ParamDataSet(name="dsSearch") List<Map<String, Object>> datasets) {
	//public NexacroResult nxTestData(@ParamVariable(name="reqId") String reqId) {
	public NexacroResult nxTestData(@ParamVariable(name="dsSearch", required = false) TestVO searchVo) throws NexacroException {
		
		NexacroResult res = new NexacroResult();
		try {
			res.addDataSet("dsTestList", testService.selectTestListById(searchVo.getId()));
			return res;
		}
		catch(Exception ex) {
			res.setErrorCode(-99);
			res.setErrorMsg(ex.getMessage());
			return null;
		}
	}

}
