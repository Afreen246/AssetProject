package com.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.dao.OrganizationRepo;
import com.prj.entities.Organization;

//@Service
public class OrgServiceImpl implements OrgService{
	
	@Autowired
	private OrganizationRepo repo;

	@Override
	public Organization save(Organization org) {
		
		return repo.save(org);
	}

	@Override
	public List<Organization> findall() {
		
		return repo.findAll();
	}

}
