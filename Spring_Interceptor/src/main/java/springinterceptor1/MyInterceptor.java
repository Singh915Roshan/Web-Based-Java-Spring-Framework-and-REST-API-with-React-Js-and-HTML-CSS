package springinterceptor1;

import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//public class MyInterceptor extends HandlerInterceptorAdapter
public class MyInterceptor implements HandlerInterceptor
{

	public boolean preHandler(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		System.out.println("This is pre-Handler");
		
		String name = request.getParameter("user");
		if(name.startsWith("d")) {
			response.setContentType("text/html");
			response.getWriter().print("<h1>Invalide Name... Name should not starts with 'd'</h1>");
			return false;
		}
		return true;
	}
	
	
}
