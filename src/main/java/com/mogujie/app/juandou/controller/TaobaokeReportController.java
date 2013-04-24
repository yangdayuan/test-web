package com.mogujie.app.juandou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author lvpinglin
 *
 */
@Controller
public class TaobaokeReportController {
	
	/**
	 * 获取指定某天的报表
	 * @param date
	 * @return
	 */
	@RequestMapping(value = "/{date}")
	public String getReportByDate(@PathVariable String date) {
		//TODO
		return "";
	}

}
