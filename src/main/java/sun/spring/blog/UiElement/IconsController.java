package sun.spring.blog.UiElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IconsController {
	@RequestMapping(value = "/UiElement/Icons")
	public ModelAndView IconsView(ModelAndView mv) throws Exception{
		String page = "/UiElement/Icons";
		mv.setViewName(page);
		return mv;
	}
}
