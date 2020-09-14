package com.wh.pjtr.ngs.cust.sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class CommonVO {
	String createId;
	String createDttm;
	String updateId;
	String updateDttm;
	
	/** 등록,수정,삭제 구분값 */
	int rowType; 
	int pageNum;
	int pageCnt;
	int totalCnt;
	
	String sessionUserType;
	String sessionUserId;
}
