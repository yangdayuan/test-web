package com.mogujie.app.juandou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author lvpinglin
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response) {
		//TODO
	}
	
	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		//TODO
	}

}
