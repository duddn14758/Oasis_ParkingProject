package sun.spring.blog.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "/Login/Login")
	public ModelAndView LoginView(ModelAndView mv) throws Exception{
		String page = "/Login/Login";
		mv.setViewName(page);
		return mv;
	}
}
