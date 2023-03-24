package com.bouasoft.backend.irunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.bouasoft.backend.models.Role;
import com.bouasoft.backend.services.RoleService;

public class runner implements CommandLineRunner{

	@Autowired
	private RoleService roleServ;
	@Override
	public void run(String... args) throws Exception {
		
		Role role1 = new Role();
		role1.setCode("ADMIN");
		role1.setLabel("Bank Administrator");
		
		roleServ.add(role1);
		
		roleServ.getAll().stream().forEach(ele->{
			System.out.println(ele.getId()+" ,"+ele.getCode()+" ,"+ele.getLabel());
		});
		
		
	}

}
