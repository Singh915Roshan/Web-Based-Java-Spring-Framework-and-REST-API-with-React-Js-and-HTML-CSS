package springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {									//Redirecting in SpringMVC

//	@RequestMapping("/one")     							//1. by using - return "redirect:/two";
//	public String one() {
//		System.out.println("This is first Handler");
////		return "";
//		return "redirect:/two";								//Now one() redirecting to two() by using this state. if we call /one we get output /one + /two
//	}
	
	@RequestMapping("/one")     							//2. by using - redirectView.setUrl("two");
	public RedirectView one() {
		System.out.println("This is first Handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;								//Now one() redirecting to two() by using this state. if we call /one we get output /one + /two
	}
	
//	@RequestMapping("/one")     							//3. by using - HttpServletResponse response (Not Working)
//	public String one(HttpServletResponse response) {
//		System.out.println("This is first Handler");
//		try {
//			response.sendRedirect("two");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		return "";								//Now one() redirecting to two() by using this state. if we call /one we get output /one + /two
//	}
	
	@RequestMapping("/two")                               
	public String two() {
		System.out.println("This is Second Handler");
		return "";
	}
}
