package SpringBootMVC.MVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home()
	{
		//System.out.println("Home Works");
		//DespactorServlet
		
		return "Index.jsp";
	}
	
	@RequestMapping("add")
	//HttpServletRequest request
	public ModelAndView add(@RequestParam("NUM_1") int firstNum, @RequestParam("NUM_2") int secondNum, HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result.jsp");
		
		
		int result = firstNum + secondNum;
		mv.addObject("result", result);
		//session = request.getSession();
		//session.setAttribute("result", result);
		
		return mv; //"result.jsp";
	}
}
