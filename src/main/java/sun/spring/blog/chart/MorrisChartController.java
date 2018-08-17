package sun.spring.blog.chart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MorrisChartController {
	
	@RequestMapping(value="/Charts/MorrisChart")
	public ModelAndView MorrisChartView(ModelAndView mv) throws Exception{
		String page = "/Charts/MorrisChart";
		mv.setViewName(page);
		return mv;
	}
	
}
