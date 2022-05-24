package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("tiles")
public class TilesController {

	@RequestMapping(value="/content1" , method=RequestMethod.GET)
	public String content1() {
		return "tilesEx/content1"; // tiles definition태그의 name과 바인딩
	}
	
	@RequestMapping(value="/content2" , method=RequestMethod.GET)
	public ModelAndView content2() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("abcde"); // tiles definition태그의 name과 바인딩
		
		return mv;
		
	}
	
	@RequestMapping(value="/content3" , method=RequestMethod.GET)
	public ModelAndView content3() {
		
		return new ModelAndView("a/b");
		
	}
	
}




