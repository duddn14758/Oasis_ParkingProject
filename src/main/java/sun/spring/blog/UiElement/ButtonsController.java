package sun.spring.blog.UiElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ButtonsController {
	@RequestMapping(value = "/UiElement/Buttons")
	public ModelAndView ButtonsView(ModelAndView mv) throws Exception{
		String page = "/UiElement/Buttons";
		mv.setViewName(page);
		return mv;
	}
}
