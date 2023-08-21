package com.prj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prj.dao.OrganizationRepo;
import com.prj.dtiimpl.OrganizationDtoImpl;
import com.prj.dto.OrganizationDto;
import com.prj.entities.Organization;

@RestController
public class OrganizationController {
//	@Autowired
//	private OrganizationRepo repo;
	
	@Autowired
	private OrganizationDtoImpl impl;
	
	@GetMapping("/getAllOrg")
	public List<Organization> getAll(){
		return impl.getAll();
	} 
	
	@PostMapping("/saveORG")
	public Organization insert(@RequestBody OrganizationDto dto) {
		return impl.save(dto);
	}
	
	@PutMapping("/updateORG")
	public Organization update(@RequestBody OrganizationDto dto) {
		return impl.update(dto);
	}
	
	@DeleteMapping("/dltOrgId/{id}")
	public String deleteid(@PathVariable ("id") int id) {
		impl.delete(id);
		return "deleted successfully";
	}
	
	@GetMapping("/getorgid/{id}")
	public Organization getbyid(@PathVariable ("id") int id) {
		return impl.getbyid(id);
	}
}
