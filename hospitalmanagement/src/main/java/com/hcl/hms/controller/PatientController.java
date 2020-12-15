package com.hcl.hms.controller;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hcl.hms.dao.PatientDaoImpl;
import com.hcl.hms.model.Patient;
import com.hcl.hms.service.PatientService;

@Controller
public class PatientController {
	private static final Logger logger = LogManager.getLogger(PatientDaoImpl.class);
	@Autowired
	private PatientService patientService;

	@GetMapping(value = "enroll")
	public String entrollPatient(Model model) {

		/*
		 * Patient patient= new Patient(); patient.setFname("Beena");
		 * patient.setLname("Kandpal"); patient.setDob("06/02/1998");
		 * patient.setEmail("demoemail@gmail.com"); patient.setNumber(1234567890);
		 * patient.setPassword("124356"); patient.setState("Delhi");
		 * patient.setInsurance_plan("#-plan");
		 */

		model.addAttribute("patient", new Patient());
		// patient= patientService.enrollPatient(patient);
		return "enroll";

	}

	@PostMapping(value = "after_enroll")
	public String afterEnrollPatient(@Valid Patient patient, Model model) {

		patient = patientService.enrollPatient(patient);

		if (patient != null) {
			model.addAttribute("patient", patient);
			return "success";
		} else {
			String errMessage = "Patient Not Enrolled";
			// model.addAttribute("error", errMessage);
			model.addAttribute("error", errMessage);
			return "enroll";
		}

	}
	
	
	

}
