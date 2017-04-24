package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.TypeDao;
import co.simplon.domain.Utilisateur;

@Service
public class TypeService {

	@Autowired 
	
	private TypeDao dao;
	private Utilisateur gars;
		

	
	public Utilisateur findbyNom(String nom) {
		return dao.findByNom(nom);
	}
	
	public List<String> findAllNom() {
		List<String> resultat = new ArrayList<>();
		//La requete findAll n'est meme pas a specifier dans TypeDao
		Iterable<Utilisateur> select = dao.findAll();
		for (Utilisateur type : select) {
			gars.setNom(type.getNom());
			resultat.add(gars.getNom());
		}
		return resultat;
	}
}
