package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.RoleDao;
import co.simplon.domain.Role;

@Service
public class RoleService {
	
	//Cree automatique l'instance et/ou la classe demandé si necessaire
	@Autowired 
	private RoleDao dao;
	
	public Iterable<Role> findAll() {
		return dao.findAll();
	}
	
	public Role findByName(String name) {
		return dao.findByName(name);
	}
	
	public Role save(Role role) {
		return dao.save(role);
	}
	
	public List<Role> findList(List<Role> listRole) {
		List <Role> roleList = new ArrayList<>();
		for (Role role2 :listRole){
			Role role = new Role();
				role.setId(role2.getId());
				role.setName(role2.getName());
				roleList.add(role);}
		return roleList;
	}
	
}
