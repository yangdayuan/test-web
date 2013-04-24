package com.mogujie.app.juandou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author lvpinglin
 *
 */
@Controller
public class ItemController {
	
	/**
	 * 查找商品
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/item")
	public String search(ModelMap model) {
		//TODO
		return "";
	}

}
