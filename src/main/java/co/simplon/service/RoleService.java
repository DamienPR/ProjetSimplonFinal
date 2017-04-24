package co.simplon.service;

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
	
	public Role findByNom(String fffe) {
		return dao.findByNom(fffe);
	}
	
	public Role save(Role role) {
		return dao.save(role);
	}
	
}
