package SpringBootMVC.MVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController 
{
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home()
	{
		//System.out.println("Home Works");
		//DespactorServlet
		
		return "Index.jsp";
	}
	
	@RequestMapping(value="add", method=RequestMethod.GET)
	public String add(HttpServletRequest request)
	{
		//int firstNum = Integer.parseInt(request.getParameter("NUM_1"));
		//int secondNum = Integer.parseInt(request.getParameter("NUM_2"));
		
		String s1 = request.getParameter("NUM_1");
		String s2 = request.getParameter("NUM_2");
		
		String result = "Hello " + s1 + " " + s2;
		
		HttpSession session = request.getSession();
		
		session.setAttribute("result", result);
		
		return "result.jsp";
	}
}
