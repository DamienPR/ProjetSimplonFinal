package co.simplon.usersservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.users.User;
import co.simplon.usersdao.UserDao;

@Service
public class UserService {

	@Autowired 
	
	private UserDao dao;
		
	public List<User> findAll () {
		List <User> accountList = new ArrayList<>();
		Iterable <User> findall = dao.findAll();
		for (User account2: findall) {
			User account= new User();
				account.setId(account2.getId());
//				account.setRole(account2.getRole());
				accountList.add(account);
		}
		return accountList;
	}
		
	public User findbyPersomail(String persomail) {
		return dao.findByPersomail(persomail);
	}
	
	public List<String> findAllNom() {
		List<String> resultat = new ArrayList<>();
		//La requete findAll n'est meme pas a specifier dans TypeDao
		Iterable<User> select = dao.findAll();
		for (User type : select) {
			User user = new User();
			user.setFirstname(type.getFirstname());
			resultat.add(user.getFirstname());
		}
		return resultat;
	}
}
