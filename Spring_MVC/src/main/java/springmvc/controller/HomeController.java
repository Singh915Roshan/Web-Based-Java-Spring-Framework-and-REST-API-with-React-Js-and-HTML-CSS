package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("first")												//if we use @RequestMapping at on class we should call 1st class then method
public class HomeController {

				//for called specific method we use below format
	@RequestMapping(path="/home", method=RequestMethod.GET)             //Configuring & code our SpringMVC project
	public String home() {
		System.out.println("Go to Home Page");                          //Static data Send to JSP
		return "home";
	}
	
	@RequestMapping("/about")											//Dynamic Data send to JSP
	public String about(Model model) {
		System.out.println("Go to About Page");
		model.addAttribute("name", "Ashish Balpande");
		model.addAttribute("id", 101);
		return "about";
	}
	
	@RequestMapping("/service")											//Dynamic Data(List) send to JSP
	public String service(Model model) {
		System.out.println("Go to Service Page");
		
		List<String> contacts = new ArrayList<String>();
		contacts.add("Manish");
		contacts.add("Pravin");
		contacts.add("Akash");
		
		model.addAttribute("con", contacts);
		return "service";
	}
	
	
	@RequestMapping("/help")											//Dynamic Data send to JSP by using Model and View
	public ModelAndView help() {
		System.out.println("Go to Help Page");
		
		LocalDateTime now = LocalDateTime.now();
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(24);
		list.add(432);
		list.add(9876);
	
 		
		//Creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		
		//Setting the Data
		modelAndView.addObject("name", "Ashish Balpande");
		modelAndView.addObject("rollNumber", 1234);
		modelAndView.addObject("time", now);                 //for time
		modelAndView.addObject("marks", list);
		
		//Setting the View name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
