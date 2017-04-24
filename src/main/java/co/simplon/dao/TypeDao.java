package co.simplon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.simplon.domain.Utilisateur;

public interface TypeDao extends CrudRepository<Utilisateur, Long> {
	
	public Utilisateur findByNom(String nom);
	public Iterable<Utilisateur> findByRolesId(long id);
	public void deleteByNom(String nom);
	
	//Permet de creer des methodes non comprise par Hibernate
	@Query("select nom from Utilisateur")
	public List<String> findNom();
	
}
