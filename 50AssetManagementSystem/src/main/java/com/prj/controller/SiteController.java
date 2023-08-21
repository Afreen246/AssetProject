package com.prj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prj.dtiimpl.SiteDtoImpl;
import com.prj.dto.SiteDto;
import com.prj.entities.Site;

@RestController
public class SiteController {

	@Autowired
	private SiteDtoImpl impl;
	
	@GetMapping("/getSite")
	public List<Site> findAll(){
		return impl.getAll();
	}
	
	@PostMapping("/saveSite")
	public Site insert(@RequestBody SiteDto dto) {
		return impl.insert(dto);
	}
	
	@PutMapping("/updateSite")
	public Site update(@RequestBody SiteDto dto) {
		return impl.update(dto);
	}
	
	@DeleteMapping("/dltsid/{id}")
	public String delete(@PathVariable ("id") int sid)
	{
		impl.delete(sid);
		return "deleted successfully";
	}
	
	@GetMapping("/getsid/{id}")
	public Site getbyid(@PathVariable ("id") int sid) {
		return impl.getbyid(sid);
	}
	
	
}
