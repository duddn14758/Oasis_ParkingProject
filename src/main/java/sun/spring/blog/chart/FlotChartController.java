package sun.spring.blog.chart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FlotChartController {
	
	@RequestMapping(value = "/Charts/FloatChart")
	public ModelAndView FloatChartView(ModelAndView mv) throws Exception{
		String page = "/Charts/FloatChart";
		mv.setViewName(page);
		return mv;
	}
}
