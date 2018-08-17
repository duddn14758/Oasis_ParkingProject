package sun.spring.blog.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@RequestMapping(value = "/Form/Form")
	public ModelAndView FormView(ModelAndView mv) throws Exception{
		String page = "/Form/Form";
		mv.setViewName(page);
		return mv;
	}
}
