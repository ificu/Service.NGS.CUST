package com.wh.pjtr.NGS.CUST.model.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class TestVO extends CommonVO {
	String id;
	String desc;
}
