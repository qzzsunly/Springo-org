package io.springo.org.api.model;

import java.util.Map;


/**
 * 抽象用户组类型
 */
public interface IGroup{
 
	
	
	/**
	 * 组织ID
	 * @return
	 */
	String getGroupId();
	
	/**
	 * 组织名称
	 * @return
	 */
	String getName();
	
	/**
	 * 组织编码
	 * @return
	 */
	String getGroupCode();
	
	/**
	 * 组排序
	 * @return
	 */
	Long getOrderNo();
	
	/**
	 * 组织类型。
	 * 比如：org,role,pos
	 * @return
	 */
	String getGroupType();
	
	/**
	 * 上级ID
	 * @return
	 */
	String getParentId();
	
	//路径 例如xxx.xxxx
	String getPath();
	/**
	 * 获取参数。
	 * @return
	 */
	Map<String, Object> getParams();
}
