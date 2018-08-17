package sun.spring.blog.UiElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TypographyController {
	@RequestMapping(value = "/UiElement/Typography")
	public ModelAndView TypographyView(ModelAndView mv) throws Exception{
		String page = "/UiElement/Typography";
		mv.setViewName(page);
		return mv;
	}
}
