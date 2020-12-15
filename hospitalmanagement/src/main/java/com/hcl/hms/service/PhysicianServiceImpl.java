package com.hcl.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.hms.dao.PhysicianDao;
import com.hcl.hms.model.Physician;

@Service
public class PhysicianServiceImpl implements PhysicianService {
	@Autowired
	private PhysicianDao physicianDao;

	@Override
	@Transactional
	public Physician addPhysician(Physician physician) {

		return physicianDao.addPhysician(physician);
	}

	@Override
	@Transactional
	public List<Physician> getByState(String state) {
		
		return physicianDao.getByState(state);
	}

}
