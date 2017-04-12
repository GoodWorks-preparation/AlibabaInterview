package com.boonya.alibaba.javabase;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
/**
 * HashMap的实现
 * 
 * @package com.boonya.alibaba.javabase.BHashMap
 * @date   2017年4月12日  上午11:39:24
 * @author pengjunlin
 * @comment   
 * @update
 */
public class BHashMap extends HashMap<String, Object>{
	
	private static final Logger logger=LoggerFactory.getLogger(BHashMap.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 2510579473787962617L;
	
	/**
	 * 问题一：HashMap是否可以设置null的键值
	 * 
	 * @MethodName: testQuestion1 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testQuestion1(){
		String token=null;
		Map<String,Object> map=null;
		
		logger.info("****************问：HashMap是否可以设置null的键值====有3种情况=====(Situation1：key=null,Situation2:value=null,Situation3:Situation1&Situation2)******************");
		
		map=new HashMap<String,Object>();
		map.put(null, "token");
		logger.info("Situation1：key=null 方法会直接调用putForNullKey(value) JSON map="+JSON.toJSONString(map));
		logger.info("Situation1：get(null) ="+map.get(null));
		
		map=new HashMap<String,Object>();
		map.put("token", token);
		logger.info("Situation2：value=null JSON map="+JSON.toJSONString(map));
		logger.info("Situation2：get('token') ="+map.get("token"));
		
		map=new HashMap<String,Object>();
		map.put(token, token);
		logger.info("Situation3:Situation1&Situation2)) JSON map="+JSON.toJSONString(map));
		logger.info("Situation3：get(null) ="+map.get(null));
		
		logger.info("*****************Conlusion**********:HashMap可以存储key=null的键值而不能存储value为空的键值");
	}

}
