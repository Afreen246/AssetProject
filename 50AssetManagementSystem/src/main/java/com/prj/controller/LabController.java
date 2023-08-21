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

import com.prj.dtiimpl.LabDtoImpl;
import com.prj.dto.LabDto;
import com.prj.entities.Lab;

@RestController
public class LabController {

	@Autowired
	private LabDtoImpl impl;
	
	@GetMapping("/getLabs")
	public List<Lab> getAll(){
		return impl.getAll();
	}
	
	@PostMapping("/saveLab")
	public Lab insert(@RequestBody LabDto dto) {
		return impl.insert(dto);
	}
	
	@PutMapping("/updateLab")
	public Lab update(@RequestBody LabDto dto) {
		return impl.update(dto);
	}
	
	@DeleteMapping("/dltlid/{lid}")
	public String delete(@PathVariable ("lid") int id) {
		impl.delete(id);
		return "deleted successfully";
		
	}
	
	@GetMapping("/getlid/{id}")
	public Lab getbyid(@PathVariable ("id") int id) {
		return impl.getbyid(id);
	}
}
