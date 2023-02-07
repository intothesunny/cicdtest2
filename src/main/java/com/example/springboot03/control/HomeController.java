package com.example.springboot03.control;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	// private Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/home")
	public String home(Model model) {
		//log.info(">>>>>>>>>>>>>>>  : HomeController.home()  ");
		
		model.addAttribute("msg", "Hello spring boot JSP"); 
		return "home";
	}
	@GetMapping("/welcome")
	public String hi(Model model) {
		model.addAttribute("name", "HONG2"); 
		return "welcome";
	}
}
