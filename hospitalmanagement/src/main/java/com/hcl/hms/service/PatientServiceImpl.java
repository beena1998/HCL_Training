package com.hcl.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.hms.dao.PatientDao;
import com.hcl.hms.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientDao patientDao;

	@Override
	@Transactional
	public Patient enrollPatient(Patient patient) {
      
			System.out.println("In Service Layer!!");
			System.out.println(patient.getFirstName());
		return patientDao.enrollPatient(patient);
	}

}
