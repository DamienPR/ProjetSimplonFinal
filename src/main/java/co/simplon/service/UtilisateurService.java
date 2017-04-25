package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.UtilisateurDao;
import co.simplon.domain.Utilisateur;

@Service
public class UtilisateurService {

	@Autowired 
	
	private UtilisateurDao dao;
	
	@Autowired 

	private RoleService roleservice;

	
	public List<Utilisateur> findAll () {
		List <Utilisateur> accountList = new ArrayList<>();
		Iterable <Utilisateur> findall = dao.findAll();
		for (Utilisateur account2: findall) {
			Utilisateur account= new Utilisateur();
				account.setId(account2.getId());
				account.setRoles(roleservice.findList(account2.getRoles()));
				accountList.add(account);
		}
		return accountList;
	}
		
	public Utilisateur findbyUsername(String username) {
		return dao.findByUsername(username);
	}
	
	public List<String> findAllNom() {
		List<String> resultat = new ArrayList<>();
		//La requete findAll n'est meme pas a specifier dans TypeDao
		Iterable<Utilisateur> select = dao.findAll();
		for (Utilisateur type : select) {
			Utilisateur user = new Utilisateur();
			user.setUsername(type.getUsername());
			resultat.add(user.getUsername());
		}
		return resultat;
	}
}
