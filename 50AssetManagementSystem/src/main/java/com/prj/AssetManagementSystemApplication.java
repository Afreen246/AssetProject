package com.prj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prj.entities.Lab;
import com.prj.entities.Organization;
import com.prj.entities.Site;

@SpringBootApplication
public class AssetManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AssetManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<Lab> list=new ArrayList<>();
//		Lab l=new Lab(01, "RK lab", "afreen");
//		list.add(l);
//		
//		Site s=new Site(01, "sk", "fathima", list);
//		List<Site> site=new ArrayList<>();
//		site.add(s);
//		Organization org=new Organization(01, "muhammad", "pharma medical", site);
//		System.out.println(org);
		
		
	}

}
