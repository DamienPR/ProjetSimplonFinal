package co.simplon.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//Previent SpringBoot Security
@EnableWebSecurity

@Configuration

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	//Override la methode configure
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.formLogin()
			.loginPage("/login.html")
				.usernameParameter("username").passwordParameter("password")
				.defaultSuccessUrl("/index.html")
				.failureUrl("/login.html")
		.and()
			.logout()
				.logoutUrl("/logout")
				.deleteCookies("JSESSIONID")
				.permitAll()
		.and()
			.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/login.html").denyAll()
			.antMatchers("/administrateur/**").hasAuthority("ROLE_administrateur")
			.antMatchers("/formateur/**").hasAuthority("ROLE_formateur")
			.antMatchers("/apprenant/**").hasAuthority("ROLE_apprenant")
			.anyRequest().authenticated()
		.and()
			.csrf()
			.disable();
	}
}
