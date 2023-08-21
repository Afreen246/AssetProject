package com.prj.service;

import java.util.List;

import com.prj.entities.Site;

public interface SiteService {
	
	public Site insert(Site s);
	
	public List<Site> findall();
}
