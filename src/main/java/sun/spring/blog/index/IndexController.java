package sun.spring.blog.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/")
	public ModelAndView IndexView(ModelAndView mv) throws Exception{
		String page = "/Index/index";
		mv.setViewName(page);
		return mv;
	}
}