package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {										//Centralized Exception Handling (for complete project)

	@ExceptionHandler(value=NullPointerException.class)                               //Null pointer exception Handler
	public String exeptionHandlerNull(Model m) {
		System.out.println("Null Pointer Exeption has occuered");
		m.addAttribute("msg", "Null Pointer Exeption has occuered");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)     //for send status code
	@ExceptionHandler(value=NumberFormatException.class)
	public String exeptionHandlerNumberFormate(Model m) {								//NumberFormate exception Handler
		System.out.println("Number Format Exception has occuered");
		m.addAttribute("msg", "Number Format Exception has occuered");
		return "null_page";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m) {									//Generic exception Handler (always use at last exception)
		System.out.println("Generic Exeption has occuerd");
		m.addAttribute("msg", "Generic Exeption has occuerd");
		return "null_page";
	}
}
