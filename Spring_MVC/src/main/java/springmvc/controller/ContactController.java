package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {                                     //Create HTML form to take Input from user
	
	@Autowired														//User Registration using SpringMVC and SpringORM
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {								//By using @ModelAttribute, we can merge common code at a place.
		m.addAttribute("Header", "MVC Project Created");
		m.addAttribute("Desc", "-by Ashish Balpande");
	}
	
	@RequestMapping("contact")
	public String showForm(Model m) {
		System.out.println("Creating form...");
//		m.addAttribute("Header", "MVC Project Created");   //this code is same as handelform()   
//		m.addAttribute("Desc", "-by Ashish Balpande");     //this code is same as handelform()
		return "contact";
	}
	
//	@RequestMapping(path="/processform", method=RequestMethod.POST)             //By using HttpServletRequest request
//	public String handleform(HttpServletRequest request) {
//		String email = request.getParameter("email");
//		System.out.println("User email is "+email);
//		return "";
//	}
	
	
//	@RequestMapping(path="/processform", method=RequestMethod.POST)       		//By using @RequestParam display output on Console     
//	public String handleform(
//			@RequestParam("email") String userEmail,
//			@RequestParam("userName") String userName,
//			@RequestParam("password") String userPassword) {
//		System.out.println("User email : "+userEmail);
//		System.out.println("User Name : "+userName);
//		System.out.println("User Password : "+userPassword);
//		return "";
//	}
	
//	@RequestMapping(path="/processform", method=RequestMethod.POST)            //By using @RequestParam we are make and display output at Success.jsp page
//	public String handleform(
//			@RequestParam(name="email", required=true) String userEmail,       //by default its "true", if "false" we can make it optional value
//			@RequestParam("userName") String userName,
//			@RequestParam("password") String userPassword,
//			Model model) {
//		System.out.println("User email : "+userEmail);
//		System.out.println("User Name : "+userName);
//		System.out.println("User Password : "+userPassword);
//		
//		//Process
//		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
//		return "success";
//	}
	
	
								//By using @RequestParam we are store values in User object and display output by using User object at Success.jsp page
		
//	@RequestMapping(path="/processform", method=RequestMethod.POST)  
//	public String handleform(
//			@RequestParam(name="email", required=true) String userEmail,       //by default its "true", if "false" we can make it optional value
//			@RequestParam("userName") String userName,
//			@RequestParam("password") String userPassword,
//			Model model) {
//		User user = new User();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(userPassword);
//		
//		System.out.println(user);
//		
//		//Process
//		
//		model.addAttribute("user", user);
//
//		return "success";
//	}
	
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)       //By using @ModelAttribute, remove all line and make it one line code.
	public String handleform(@ModelAttribute User user, Model model) {
		System.out.println("Adding details...");
		if(user.getUserName().isEmpty()) {
			return "redirect:/contact";
		}
//		model.addAttribute("Header", "MVC Project Created");    //this code is same as showform()
//		model.addAttribute("Desc", "-by Ashish Balpande");      //this code is same as showform()
		System.out.println(user);
		int createdUser = this.userService.createUser(user);									//add this state. for User Registration using SpringMVC and SpringORM
		model.addAttribute("msg", "User created with id : "+createdUser);
		return "success";
	}
}
