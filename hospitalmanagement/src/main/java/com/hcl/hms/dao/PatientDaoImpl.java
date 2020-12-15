package com.hcl.hms.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.hms.model.Patient;
@Repository
public class PatientDaoImpl implements PatientDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LogManager.getLogger(PatientDaoImpl.class);
	
	@Override
	public Patient enrollPatient(Patient patient) {
		System.out.println("In Dao");
//		logger.info("Patient Added!! "+patient.getFname());
//		System.out.println(patient.getFname());
		Session session = sessionFactory.getCurrentSession();
		session.save(patient);
		
		return patient;
	}

}
