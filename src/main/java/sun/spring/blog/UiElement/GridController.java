package sun.spring.blog.UiElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GridController {
	@RequestMapping(value = "/UiElement/Grid")
	public ModelAndView GridView(ModelAndView mv) throws Exception{
		String page = "/UiElement/Grid";
		mv.setViewName(page);
		return mv;
	}

}
