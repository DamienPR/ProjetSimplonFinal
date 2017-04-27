package co.simplon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.simplon.domain.Role;

public interface RoleDao extends CrudRepository<Role, Long> {
	
	//Grace a jpa, lit la methode, find = select where nom = ??, pas besoin de decrire la methode dans une classe
	public Role findByName(String name);
	public void deleteById(long id);
	
	//Permet de creer des methodes non comprise par Hibernate
	@Query("select `name` from Role")
	public List<String> findName();
	
}
