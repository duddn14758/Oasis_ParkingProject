package sun.spring.blog.UiElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PanelsWellsController {
	@RequestMapping(value = "/UiElement/PanelsWells")
	public ModelAndView PanelsWellsView(ModelAndView mv) throws Exception{
		String page = "/UiElement/PanelsWells";
		mv.setViewName(page);
		return mv;
	}
}
