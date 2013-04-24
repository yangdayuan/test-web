package com.mogujie.app.common;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.taobao.api.DefaultTaobaoClient;

/**
 * 
 * @author lvpinglin
 *
 */
@Component
public class TOPClient {
	
	@Resource
	private DefaultTaobaoClient defaultTaobaoClient;
	
	public DefaultTaobaoClient getDefaultTaobaoClient() {
		return defaultTaobaoClient;
	}

}
