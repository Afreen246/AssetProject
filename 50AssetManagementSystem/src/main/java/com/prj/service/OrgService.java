package com.prj.service;

import java.util.List;

import com.prj.entities.Organization;

public interface OrgService {

	public Organization save(Organization org);
	
	public List<Organization> findall();
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
}
