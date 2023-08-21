package com.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prj.dao.SiteRepository;
import com.prj.entities.Site;

public class SiteImpl implements SiteService{
	
	@Autowired
	private SiteRepository repo;

	@Override
	public Site insert(Site s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public List<Site> findall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
