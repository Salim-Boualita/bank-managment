package com.bouasoft.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bouasoft.backend.models.Role;
import com.bouasoft.backend.repositories.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepo;
	
	public List<Role> getAll(){
		return roleRepo.findAll();
	}
	
	public void add(Role role) {
		roleRepo.save(role);
	}
	
	public Optional<Role> getOne(long id) {
		return roleRepo.findById(id);
	}

}
