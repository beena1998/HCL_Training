package com.hcl.hms.dao;

import java.util.List;

import com.hcl.hms.model.Physician;

public interface PhysicianDao {
	public abstract Physician addPhysician(Physician physician);
	public abstract List<Physician> getByState(String state );
	


}
