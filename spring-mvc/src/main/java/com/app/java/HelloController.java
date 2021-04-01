package com.app.java;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/index" ,method=RequestMethod.GET)
	public String viewWelcomePage(Model model) {
		String str="CONCEPT LEARNING CENTRE";
		model.addAttribute("msg",str);
		return "welcome";
     }
	
	/*@PostMapping("/login")
	public String userLogin(HttpServletRequest request) {
		System.out.println(request.getParameter("userName")+ "\t" +request.getParameter("password"));
		return "redirect:/index";
		
	}*/
	
	/*@PostMapping("/login")
	public String userLogin(@ModelAttribute User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		return "redirect:/index";
	}*/
	
	@PostMapping("/login")
	public String userLogin(Model model,@ModelAttribute User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		model.addAttribute("names",getNames());
		return "welcome";                                        //return "redirect:/index";
	}
	
	//@ModelAttribute("names")
	public List<String> getNames(){
		List<String> list=new ArrayList<String>(); 
		list.add("ABC");
		list.add("PQR");
		list.add("XYZ");
		return list;
	}
}
