package com.ltts.project.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.Dao.AudiDao;
import com.ltts.project.Dao.MemberDao;
import com.ltts.project.model.Auditorium;
import com.ltts.project.model.Member;

@RestController
public class HomeController {
	
	@Autowired
	MemberDao md;
	
	@Autowired
	AudiDao ad;
	
	@RequestMapping("/hi")
	public String firstMethod() {
		return "Hello SpringBoot";
	}
	
	@RequestMapping(" ")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}
	@RequestMapping("/registration")
	public ModelAndView registerUser() {
		return new ModelAndView("registration");
	}
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	
	
	 @RequestMapping("/addAudi") public ModelAndView addAudiPage() { 
		 return new ModelAndView("addAudi"); 
		}
	 
	
	
	@RequestMapping(value="adduser", method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String name=req.getParameter("uname");
		String pass=req.getParameter("pass");
		String name1=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		
	//	ApplicationContext ac=new ClassPathXmlApplicationContext();
		Member m= new Member(name,pass,name1,email,mobile);
		System.out.println("***** INSIDE CONTROLLER ****"+m);
		boolean b=md.InsertMember(m);
		if(b==false) {
			mv=new ModelAndView("success");
			model.addAttribute("msg", "Successfully Inserted.. ");
		}
		else {
			mv=new ModelAndView("error");
			model.addAttribute("msg", "Error due to Connection");
			
		}
		/*
		 * try { b=md.InsertMember(m); mv=new ModelAndView("success"); } catch(Exception
		 * e) {
		 * 
		 * mv=new ModelAndView("error"); }
		 */

		return mv;
	}
	
	
	
	@RequestMapping(value="checkuser", method=RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");

		Member m=md.getMemberByEmail(email);
		System.out.println(m);


		if(m !=null) {

			if(pass.equals(m.getPassword())) {
				model.addAttribute("msg", "Welcome "+m.getUserName());
				mv=new ModelAndView("welcome");
			}
			else {
				model.addAttribute("msg", "Password Wrong");
				mv=new ModelAndView("login");
			}
		}
		else {
			model.addAttribute("msg", "User Not Found Please Register");
			mv=new ModelAndView("login");
		}
		return mv;
	}

	
	@RequestMapping(value="addaudi", method=RequestMethod.POST)
	public ModelAndView addAudi(HttpServletRequest req, Model model) {
		ModelAndView mv=null;
		String audiname= req.getParameter("auname");
		int audiId= Integer.parseInt(req.getParameter("auid"));
		int seats= Integer.parseInt(req.getParameter("seats"));
		
		Auditorium a= new Auditorium(audiname, audiId, seats);
		System.out.println("***** INSIDE CONTROLLER ****"+a);
		boolean b= ad.InsertAudi(a);
		if(b==false) {
			mv=new ModelAndView("success");
			model.addAttribute("msg", "Successfully Inserted.. ");
		}
		else {
			mv=new ModelAndView("error");
			model.addAttribute("msg", "Error due to Connection");
			
		}
		
		return mv;
	}
	
	
	@RequestMapping("/viewaudis")
	public ModelAndView viewAllAudis(Model model) {
		ModelAndView mv=new ModelAndView("viewAudi");
		List<Auditorium> li=ad.getAllAudis();

		model.addAttribute("list", li);

		return mv;
	}
}
