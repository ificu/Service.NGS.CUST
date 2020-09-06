package com.wh.pjtr.NGS.CUST.model.Common;

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
	
	int rowType; // 등록,수정,삭제 구분값
	int pageNum;
	int pageCnt;
	int totalCnt;
	
	String sessionUserType;
	String sessionUserId;
}
