package com.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.dao.LabRepository;
import com.prj.entities.Lab;

//@Service
public class LabImpl implements LabService{

	@Autowired
	private LabRepository repo;
	
	@Override
	public Lab insert(Lab l) {
		// TODO Auto-generated method stub
		return repo.save(l);
	}

	@Override
	public List<Lab> findall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
