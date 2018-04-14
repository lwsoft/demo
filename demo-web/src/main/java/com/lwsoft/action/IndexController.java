package com.lwsoft.action;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lwsoft.api.DemoInterface;
@Controller
@RequestMapping(value="/index")
public class IndexController {
	
	private DemoInterface demo;
	
	private Logger log = Logger.getLogger(IndexController.class);
	
	@RequestMapping(value="/init")
	public String init(){
		log.info("init");
		return "index";
	}
	@RequestMapping("/view")
	public String view(Model m){
		m.addAttribute("name", "123");
		return "view/index";
	}

}
