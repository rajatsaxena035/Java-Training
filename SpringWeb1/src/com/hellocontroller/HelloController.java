package com.hellocontroller;

import javax.servlet.http.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.*;

public class HelloController extends AbstractController
{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi User geek");
		return modelandview;
	}
}
