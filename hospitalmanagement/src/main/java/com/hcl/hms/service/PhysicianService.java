package com.hcl.hms.service;

import java.util.List;

import com.hcl.hms.model.Physician;

public interface PhysicianService {
	public abstract Physician addPhysician(Physician physician);

	public abstract List<Physician> getByState(String state);
}
