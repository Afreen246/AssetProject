package com.prj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prj.entities.Lab;

@Repository
public interface LabRepository extends JpaRepository<Lab, Integer>{

}
