package co.simplon.usersdao;

import org.springframework.data.repository.CrudRepository;

import co.simplon.users.User;

public interface UserDao extends CrudRepository<User, Long> {
	
	public User findByPersomail(String persomail);
	public Iterable<User> findByRoleId(long id);
	public void deleteByPassword(String password);
	
//	Permet de creer des methodes non comprise par Hibernate
//	@Query("select firstname from Utilisateur")
//	public List<String> findfirstname();
	
}
