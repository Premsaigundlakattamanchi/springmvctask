package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Fee;
import springmvc.service.FeeService;

@Controller
public class FeeController {
	@Autowired
	private FeeService feeService;
	
	@RequestMapping(value = "/feeform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute("fee") Fee fee,BindingResult result,Model model) {
		int createdFee = this.feeService.saveFee(fee);
		model.addAttribute("msg", "Fee created with id "+createdFee);
		return "csuccess";
    }
	
	
//	@RequestMapping(path="/feeform",method=RequestMethod.POST)
//	public String handleForm(@ModelAttribute Fee fee,Model model) {
//		System.out.println(fee);
//		int createdFee = this.feeService.saveFee(fee);
//		model.addAttribute("msg", "Fee created with id "+createdFee);
//		return "csuccess";
//	}
}
