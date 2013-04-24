/**
 * 
 */
package com.mogujie.app.juandou.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mogujie.app.common.BizException;
import com.mogujie.app.juandou.biz.WelcomeManager;
import com.mogujie.app.juandou.model.dataobject.User;

/**
 * @author yuexuqiang
 * 
 */
@Controller
@RequestMapping("/welcome")
public class Main {

	@Resource
	private WelcomeManager welcomeManager;

	@RequestMapping(value = "/{email:.+}", method = RequestMethod.GET)
	public String printWelcome(@PathVariable String email, ModelMap model)
			throws BizException {
		User u = welcomeManager.getLoginInfo(email);
		model.addAttribute("info", u);
		return "welcome";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome1(ModelMap model) {
		model.addAttribute("message", "Hello World");
		model.put("info", "test");
		return "welcome";
	}
}
