package co.simplon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.simplon.domain.Utilisateur;

public interface UtilisateurDao extends CrudRepository<Utilisateur, Long> {
	
	public Utilisateur findByUsername(String username);
	public Iterable<Utilisateur> findByRolesId(long id);
	public void deleteByUsername(String username);
	
	//Permet de creer des methodes non comprise par Hibernate
	@Query("select username from Utilisateur")
	public List<String> findUsername();
	
}
