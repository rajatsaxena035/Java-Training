package com.studentadmissioncontroller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController
{
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmission()
	{
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping("/submitAdmissionForm.html")
	public ModelAndView submitAdmissionForm(@RequestParam("candidateName") String name, 
			@RequestParam("candidateHobby") String hobby)
	{
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details:" + name + "-" + hobby);
		return model;
	}
}
