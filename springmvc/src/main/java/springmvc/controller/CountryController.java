package springmvc.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springmvc.Dto.CountryDTO;
import springmvc.dao.CountryDao;
import springmvc.model.Country;
import springmvc.service.CountryService;

@Controller
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@RequestMapping("/country")
	public String showform(Model model) {
		return "country";
	}
	
	
//	@RequestMapping(path="/getCountries",method=RequestMethod.GET)
//	public List<CountryDTO> getCountries() {
//		//logger.info("Begin Get Country List Service:");
//		
//		return countryService.getCountries();
//	}
	
	@RequestMapping(path="/getCountries",method=RequestMethod.GET)
	public String listCountries(Model model) {
//		model.addAttribute("country", new Country());
		model.addAttribute("CountryList", this.countryService.listCountries());
//		System.out.println(model);
//		System.out.println("CountryList");
		return "CountryList";
	}
	
	@RequestMapping(path="/fees",method=RequestMethod.GET)
	public String listCountries2(Model model) {
		model.addAttribute("country", new Country());
		model.addAttribute("CountryList", this.countryService.listCountries());
//		System.out.println(model);
		return "fees";
	}
	
	
	@RequestMapping(path="/countryform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute Country country,Model model) {
		System.out.println(country);
		int createdCountry = this.countryService.createCountry(country);
		model.addAttribute("msg", "Country created with id "+createdCountry);
		return "csuccess";
	}
	
	
	
}
