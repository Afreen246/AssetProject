package com.prj.dtiimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.dao.LabRepository;
import com.prj.dto.LabDto;
import com.prj.entities.Lab;

@Service
public class LabDtoImpl {

	@Autowired
	private LabRepository repo;
	
	public List<Lab> getAll(){
		return repo.findAll();
	}
	
	public Lab insert(LabDto dto) {
		return repo.save(Lab.builder()
				.lname(dto.getLname())
				.lcoardinator(dto.getLcoardinator())
				.build());
	}
	
	public Lab update(LabDto dto) {
		return repo.save(Lab.builder()
				.lid(dto.getLid())
				.lname(dto.getLname())
				.lcoardinator(dto.getLcoardinator())
				.build());
	}
	
	public void delete(int lid) {
		repo.deleteById(lid);
	}
	
	public Lab getbyid(int lid) {
		return repo.findById(lid).get();
	}
}
