package sun.spring.blog.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	@RequestMapping(value ="/SamplePages/Blank")
	public ModelAndView BlankView(ModelAndView mv) throws Exception{
		String page = "/SamplePages/Blank";
		mv.setViewName(page);
		return mv;
	}
}
