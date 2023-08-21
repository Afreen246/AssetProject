package com.prj.service;

import java.util.List;

import com.prj.entities.Lab;

public interface LabService {

	public Lab insert(Lab l);
	
	public List<Lab> findall();
}
