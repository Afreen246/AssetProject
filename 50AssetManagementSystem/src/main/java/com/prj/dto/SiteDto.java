package com.prj.dto;

import java.util.List;

import com.prj.entities.Lab;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class SiteDto {

	private int sid;
	private String sname;
	private String scoardinator;
	private String sitelocation;
	
	private List<Integer> labids;
}
