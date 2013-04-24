/**
 * 
 */
package com.mogujie.app.juandou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mogujie.app.common.BizException;

/**
 * @author yuexuqiang
 * 
 */
@Controller
public class Home {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome() throws BizException {
		return "home";
	}
}
