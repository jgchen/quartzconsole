package com.ethan.quartzconsole.web;

import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ethan.quartzconsole.meta.ConnectionDetail;
import com.ethan.quartzconsole.service.QuartzManagerService;
import com.ethan.quartzconsole.service.impl.QuartzManagerServiceImpl;



@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private QuartzManagerService quartzManagerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "input";
	}
	
}
