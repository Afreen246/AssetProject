package com.prj.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@ToString
@Builder

@Entity
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String sitelocation;
	private String scoardinator;
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "site")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "site_lab",
			joinColumns = @JoinColumn(name="site_id"),
			inverseJoinColumns = @JoinColumn(name="lab_id")
			)
	private List<Lab> lablist;
	
	
//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	private Organization org;
}
