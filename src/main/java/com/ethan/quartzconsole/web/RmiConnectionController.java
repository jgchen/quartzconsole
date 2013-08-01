package com.ethan.quartzconsole.web;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ethan.quartzconsole.common.Result;
import com.ethan.quartzconsole.meta.ConnectionDetail;
import com.ethan.quartzconsole.service.QuartzManagerService;

@Controller
public class RmiConnectionController {

	@Autowired
	private QuartzManagerService quartzManagerService;

	@RequestMapping(value = "/", method = RequestMethod.POST)	
	public String tryCollect(ConnectionDetail  conn,Errors errors,Model model) {
		if(errors.hasErrors()){
        	model.addAttribute("errorMessage", "请输入正确的连接信息");
			return "input";
		}
		
		Result rs = quartzManagerService.connectServer(conn);
        if(!rs.isSuccess()){
        	model.addAttribute("errorMessage", rs.getMessage());
        	return "input";
        }
		return "redirect:/instances?host="+conn.getConnectionIdentifier();
	}
	
	@RequestMapping(value = "/instances", method = RequestMethod.GET)	
	public String getInstances(@RequestParam("host") String connectionIdentifier,Model model) {
		Result rs = quartzManagerService.getQuartzInstanceInfo(connectionIdentifier);
        if(!rs.isSuccess()){
        	model.addAttribute("errorMessage", rs.getMessage());
        	return "input";
        }
    	model.addAttribute("quartzInstanceInfo", rs.getValue());
    	return "quartzInstanceInfo";

	}

}
