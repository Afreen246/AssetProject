package com.prj.dto;

import java.util.List;

import com.prj.entities.Site;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class OrganizationDto {

	private int orgid;
	private String orgname;
	private String description; 
	
	private List<Integer> siteids;

}
