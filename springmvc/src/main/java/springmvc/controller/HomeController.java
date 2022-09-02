package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("hello home url");
		model.addAttribute("name", "Prem");
		return "index";
	}
	
	
	
	@RequestMapping("/about")
	public String a() {
		System.out.println("hello about url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("hello help url");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Uttam");
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
