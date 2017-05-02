package co.simplon.usersdao;

import org.springframework.data.repository.CrudRepository;

import co.simplon.users.Role;

public interface RoleDao extends CrudRepository<Role, Long> {
	
	//Grace a jpa, lit la methode, find = select where nom = ??, pas besoin de decrire la methode dans une classe
	public Role findByName(String name);
	public void deleteById(long id);
	
}
