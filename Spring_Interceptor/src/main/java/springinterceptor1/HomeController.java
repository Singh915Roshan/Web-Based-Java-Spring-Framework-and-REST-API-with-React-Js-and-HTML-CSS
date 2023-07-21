package springinterceptor1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("go to home page");
		return "home";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam String user, Model model) {
		System.out.println("go to Welcome page");
		model.addAttribute("name", user);
		return "welcome";
	}
}
