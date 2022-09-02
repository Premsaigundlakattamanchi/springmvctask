package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springmvc.model.User;
import springmvc.service.UserService;



@RestController
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute()
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Introduction Title");
		m.addAttribute("desc", "Home for developers");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		String email=request.getParameter("email");
//		String name=request.getParameter("name");
//		String password=request.getParameter("password");
//		System.out.println(email);
//		System.out.println(name);
//		System.out.println(password );
//		
//		return "";
//	}
	
/*	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email,
			@RequestParam("name") String name,
			@RequestParam("password") String password, Model model) {
		System.out.println(email);
		
		User user=new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		
		System.out.println(user);
//		model.addAttribute("email",email);
//		model.addAttribute("name", name);
//		model.addAttribute("password", password);
		
		model.addAttribute("user",user);
	return "success";
	}
	*/
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		
		System.out.println(user);
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id "+createdUser);
		return "success";
	}
}
