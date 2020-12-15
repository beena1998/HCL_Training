package com.hcl.hms.dao;

import com.hcl.hms.model.Patient;

public interface PatientDao {
	public abstract Patient enrollPatient(Patient patient);
}
