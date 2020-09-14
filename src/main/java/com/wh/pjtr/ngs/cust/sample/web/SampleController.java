package com.wh.pjtr.ngs.cust.sample.web;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexacro.uiadapter17.spring.core.NexacroException;
import com.nexacro.uiadapter17.spring.core.annotation.ParamVariable;
import com.nexacro.uiadapter17.spring.core.data.NexacroResult;
import com.wh.pjtr.ngs.cust.sample.model.SampleVO;
import com.wh.pjtr.ngs.cust.sample.service.SampleService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/sample")
public class SampleController {
	private final SampleService sampleService;
	
	@GetMapping("/getTestData")
	public List<SampleVO> getTestData() {
		try {
			return sampleService.selectTestList();
		} catch(Exception ex) {
			log.error(ex.getMessage());
			return null;
		}
	}
	
	@PostMapping("/nxTestData")
	public NexacroResult nxTestData(@ParamVariable(name="dsSearch", required = false) SampleVO searchVo) throws NexacroException {
		NexacroResult res = new NexacroResult();
		try {
			res.addDataSet("dsTestList", sampleService.selectTestListById(searchVo.getId()));
			return res;
		} catch(Exception ex) {
			res.setErrorCode(-99);
			res.setErrorMsg(ex.getMessage());
			return null;
		}
	}

}
