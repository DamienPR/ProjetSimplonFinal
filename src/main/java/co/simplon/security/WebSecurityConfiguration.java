package co.simplon.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import co.simplon.dao.UtilisateurDao;
import co.simplon.domain.Role;
import co.simplon.domain.Utilisateur;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {
	
	@Autowired
	UtilisateurDao dao;
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(userDetailsService());
	}
	
	@Bean
	UserDetailsService userDetailsService(){
		return new UserDetailsService() {
			
			//Besoin pour le ManytoMany en Lazy
			@Transactional
			
			@Override
			public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
				Utilisateur account = dao.findByUsername(name);
				if(account != null) {
					return new User(account.getUsername(), account.getPassword(), true, true, true, true,
							getAuthorities(account.getRoles()));
				} else {
					throw new UsernameNotFoundException ("Impossible de trouver l'utilisateur :"+ name +".");
				}
			}
		};
	}
	
	//Creation d'un collection d'autorisation a partir d'une liste de role
	public Collection<? extends GrantedAuthority> getAuthorities(List<Role> roles) {
		String ROLE_PREFIX = "ROLE_";
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        for(Role role: roles){
        list.add(new SimpleGrantedAuthority(ROLE_PREFIX + role.getName()));
        }
        return list;
    }
}
