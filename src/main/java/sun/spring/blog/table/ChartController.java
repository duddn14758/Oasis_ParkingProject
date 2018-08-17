package sun.spring.blog.table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChartController {
	@RequestMapping(value ="/Table/Tables")
	public ModelAndView TableView(ModelAndView mv) throws Exception{
		String page = "/Table/Tables";
		mv.setViewName(page);
		return mv;
	}
}
