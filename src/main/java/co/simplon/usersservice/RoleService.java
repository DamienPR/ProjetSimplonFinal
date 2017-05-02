package co.simplon.usersservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.userdto.RoleDto;
import co.simplon.users.Role;
import co.simplon.usersdao.RoleDao;

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
	
	public RoleDto descripRole(Role role) {
		RoleDto roledto = new RoleDto();
		roledto.setId(role.getId());
		roledto.setName(role.getName());
		return roledto;
	}
}
