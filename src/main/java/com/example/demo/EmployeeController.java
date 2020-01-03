package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	//public String show(HttpServletRequest req) {
	@RequestMapping("home") // Execute the function whenever hit the base Url with /home
	public ModelAndView show(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		//HttpSession session = req.getSession();
		//String name = req.getParameter("name");
		mv.addObject("name", name);     // Add the name to name property
		mv.setViewName("home");  // set the jsp filename or whatever file you want
		//session.setAttribute("name", name);
		return mv;
	}
}
