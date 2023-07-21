package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	
	@RequestMapping("/name")
	public String name() {																				//Exception Handling
		System.out.println("Going to name view...");
		
//		String str = null;													//It gives java.lang.NullPointerException
//		System.out.println(str.length());
		
		String name = "Ashish";												//It gives java.lang.NumberFormateException
		Integer.parseInt(name);
		return "";
	}
	
//	@ExceptionHandler(value=NullPointerException.class)                               //Null pointer exception Handler
//	public String exeptionHandlerNull(Model m) {
//		System.out.println("Null Pointer Exeption has occuered");
//		m.addAttribute("msg", "Null Pointer Exeption has occuered");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)     //for send status code
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exeptionHandlerNumberFormate(Model m) {								//NumberFormate exception Handler
//		System.out.println("Number Format Exception has occuered");
//		m.addAttribute("msg", "Number Format Exception has occuered");
//		return "null_page";
//	}
//	
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerGeneric(Model m) {									//Generic exception Handler
//		System.out.println("Generic Exeption has occuerd");
//		m.addAttribute("msg", "Generic Exeption has occuerd");
//		return "null_page";
//	}
}
