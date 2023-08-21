package com.prj.dtiimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.dao.LabRepository;
import com.prj.dao.SiteRepository;
import com.prj.dto.SiteDto;
import com.prj.entities.Lab;
import com.prj.entities.Site;
import com.prj.exceptionHand.GivenIdNotFoundException;

@Service
public class SiteDtoImpl {

	@Autowired
	private SiteRepository repo;
	
	@Autowired
	private LabRepository labrepo;
	
	public List<Site> getAll(){
		return repo.findAll();
	}
	
	public Site insert(SiteDto dto) {
		List<Lab> labid=labrepo.findAllById(dto.getLabids());
		return repo.save(Site.builder()
				.sname(dto.getSname())
				.sitelocation(dto.getSitelocation())
				.lablist(labid)
				.scoardinator(dto.getScoardinator())
				.build()
				);
	}
	
	public Site update(SiteDto dto) {
		List<Lab> labid=labrepo.findAllById(dto.getLabids());
		return repo.save(Site.builder()
				.sid(dto.getSid())
				.sname(dto.getSname())
				.sitelocation(dto.getSitelocation())
				.lablist(labid)
				.scoardinator(dto.getScoardinator())
				.build()
				);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	public Site getbyid(int id) {
		Optional<Site> resultid = repo.findById(id);
		if(resultid.isPresent()) {
			return  resultid.get();
		}
		else {
			throw new GivenIdNotFoundException("Given Id Is Notpresent");
		}
	}
}
