package com.lwsoft.action;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lwsoft.api.entity.User;
import com.lwsoft.api.service.DemoInterface;
@Controller
@RequestMapping(value="/index")
public class IndexController {
	@Reference(interfaceClass=com.lwsoft.api.service.DemoInterface.class)
	private DemoInterface demo;
	
	private Logger log = Logger.getLogger(IndexController.class);
	
	@RequestMapping(value="/init")
	public String init(){
		log.info("init");
		return "index";
	}
	@RequestMapping("/view")
	public String view(Model m){
		User user = demo.getUser();
		System.out.println(user.getName());
		m.addAttribute("name",user.getName());
		return "view/index";
	}

}
