package com.prj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prj.entities.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Integer>{

}
