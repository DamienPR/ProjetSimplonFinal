package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Utilisateur;
import co.simplon.service.UtilisateurService;

@RestController
@RequestMapping("/apprenant")
public class AccountRestController {     

	  @Autowired
	  
	  private UtilisateurService service;
	  
	  //@RequestMapping(method=RequestMethod.GET)
	  @PreAuthorize("hasRole('ROLE_apprenant')")
	  @GetMapping

	  public List<Utilisateur> getAll() {
		    return service.findAll();
		  }
	  
//	  public Object details() {
//		  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		  Object currentPrincipalName =  authentication.getDetails();
//		return currentPrincipalName;
//	  }
	  
//	  public List<Role> roles() {
//	  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//	  List<Role> currentPrincipalRoles =  authentication.getRoles();
//	  return currentPrincipalRoles;
//  }
	  
//	  public Collection<? extends GrantedAuthority> authorities() {
//		  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		  Collection<? extends GrantedAuthority> currentPrincipalAuthorities =  authentication.getAuthorities();
//		  return currentPrincipalAuthorities;
//	  }
	  
//	  public String nom() {
//		  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		  String currentPrincipalName = authentication.getName();
//		  return currentPrincipalName;
//	  }
//	  
//	  	  
//	  @RequestMapping(method=RequestMethod.POST)
//	  public Account create(@RequestBody Account account) {
//	    return Dao.save(account);
//	  }
//	  
//	  @RequestMapping(method=RequestMethod.DELETE, value="{id}")
//	  public void delete(@PathVariable int id) {
//	    Dao.delete(id);
//	  }
//	  
//	  @RequestMapping(method=RequestMethod.PUT, value="{id}")
//	  public Account update(@PathVariable int id, @RequestBody Account contact) {
//	    Account update = Dao.findOne(id);
//	    update.setUsername(contact.getUsername());
//	    return Dao.save(update);
//	  }

}