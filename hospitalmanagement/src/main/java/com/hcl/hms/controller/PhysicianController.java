package com.hcl.hms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.hms.model.Patient;
import com.hcl.hms.model.Physician;
import com.hcl.hms.service.PhysicianService;
import com.hcl.hms.service.PhysicianServiceImpl;

@Controller
public class PhysicianController {
	@Autowired
	private PhysicianService physicianService;
	@GetMapping(value = "addPhysician")
	public String entrollPatient(Model model) {


		model.addAttribute("physician", new Physician());
		
		return "addPhysician";

	}
	
	@PostMapping(value="physicianadded")
	public String addPhysican(@Valid Model model, Physician physician ) {
		physician = physicianService.addPhysician(physician) ;

		if (physician != null) {
			model.addAttribute("physician", physician);
			return "success";
		} else {
			String errMessage = "Physician Not Enrolled";
			// model.addAttribute("error", errMessage);
			model.addAttribute("error", errMessage);
			return "addPhysician";
		}
		
	}
	
	@GetMapping(value="home")
	public String Home() {
		return "home";
	}
	
	@GetMapping(value="/searchPhysician")
	public String searchPhysician() {
		return "searchPhysician";
	}
	
	@RequestMapping(value="/searchPhysicianByState")
	public String searchPhysicianByState(@RequestParam("state") String state,  Model model,HttpServletRequest request, HttpServletResponse response) {
		
		List<Physician> phy=physicianService.getByState(state);
		model.addAttribute("physician", phy);
		
		return "searchPhysician";
	}
	
	
	
	

}
