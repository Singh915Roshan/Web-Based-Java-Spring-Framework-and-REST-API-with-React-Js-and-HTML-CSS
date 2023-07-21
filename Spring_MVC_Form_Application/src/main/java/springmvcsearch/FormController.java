package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {														//Handling Complex form

	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result, Model model) {
		
		if(result.hasErrors()) {												//Handling Error in form by using BindingResult 
			return "complex_form";
		}
		
		model.addAttribute("register", "Student is Successfully register there Form...");
		System.out.println(student);
		System.out.println(student.getAddress());								//More Complex Handling form /Auto Binding with custome type
		return "success";
	}
}
