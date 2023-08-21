package com.prj.dtiimpl;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.prj.dao.LabRepository;
import com.prj.dao.OrganizationRepo;
import com.prj.dao.SiteRepository;
//import com.prj.dto.LabDto;
import com.prj.dto.OrganizationDto;
//import com.prj.dto.SiteDto;
//import com.prj.entities.Lab;
import com.prj.entities.Organization;
import com.prj.entities.Site;

@Service
public class OrganizationDtoImpl{
	
	@Autowired
	private OrganizationRepo orgrepo;
	
	@Autowired
	private SiteRepository siterepo;
	

	public List<Organization> getAll(){
		return orgrepo.findAll();
	}
	
	public Organization save(OrganizationDto orgdto) {
		List<Site> siteids=siterepo.findAllById(orgdto.getSiteids());
		return orgrepo.save(Organization.builder().orgname(orgdto.getOrgname())
			       .description(orgdto.getDescription())
			       .sitelist(siteids)
			       .build());
	}
	
	public Organization update(OrganizationDto orgdto) {
		List<Site> siteids=siterepo.findAllById(orgdto.getSiteids());
		return orgrepo.save(Organization.builder()
				   .orgid(orgdto.getOrgid())
				   .orgname(orgdto.getOrgname())
			       .description(orgdto.getDescription())
			       .sitelist(siteids)
			       .build());
	}
	
	public void delete(int orgid) {
		orgrepo.deleteById(orgid);
	}
	
	public Organization getbyid(int orgid) {
		return orgrepo.findById(orgid).get();
	}

}
