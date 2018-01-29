package com.baseInfoUtility;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * 人员基础信息类
 * @author yangzf
 * @since 2018年1月24日 上午7:53:20
 */
@Component
public class PublicPersonelInfo {

	/**
	 * @return 0-男;1-女;2-保密
	 * @since 2017年12月2日 下午9:33:53
	 */
	public Map<Integer, String> getSexMap(){
		Map<Integer, String> sexMap = new HashMap<Integer, String>();
		sexMap.put(0, "男");
		sexMap.put(1, "女");
		sexMap.put(2, "保密");
		return sexMap;
	}
	
	/**
	 * @return 员工类型：1-正式员工；2-实习员工；3-临时员工
	 * @author yangzf
	 * @since 2018年1月28日 下午9:06:34
	 */
	public Map<Integer, String> getEmployeeTypeMap(){
		Map<Integer, String> employeeTypeMap = new HashMap<Integer, String>();
		employeeTypeMap.put(1, "正式员工");
		employeeTypeMap.put(2, "实习员工");
		employeeTypeMap.put(3, "临时员工");
		return employeeTypeMap;
	}
}
