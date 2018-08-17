package sun.spring.blog.UiElement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NotificationsController {
	@RequestMapping(value = "/UiElement/Notifications")
	public ModelAndView NotificationsView(ModelAndView mv) throws Exception{
		String page = "/UiElement/Notifications";
		mv.setViewName(page);
		return mv;
	}
}
