package com.marks;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class markController {
	@RequestMapping("ms")
	public ModelAndView mul(Details dp)
	{
		ModelAndView mv= new ModelAndView();
		int tamil=dp.getTamil();
		int english=dp.getEnglish();
		int maths=dp.getMaths();
		int science=dp.getScience();
		int social=dp.getSocial();
		int t=tamil+english+maths+science+social;
		double a=t/5;
		mv.addObject("details", dp);
		mv.addObject("total",t);
		mv.addObject("average",a);
		mv.setViewName("markss");
		return mv;
	}

}