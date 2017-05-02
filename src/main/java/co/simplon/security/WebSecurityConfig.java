package co.simplon.security;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

//Previent SpringBoot Security
@EnableWebSecurity

@Configuration

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	//Override la methode configure
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
//		.formLogin()
//			.loginPage("/login.html")
//				.usernameParameter("username").passwordParameter("password")
//				.defaultSuccessUrl("/index.html")
//				.failureUrl("/login.html")
//		.and()
//			.logout()
//				.logoutUrl("/logout")
//				.deleteCookies("JSESSIONID")
//				.permitAll()
//		.and()
//			.authorizeRequests()
//			.antMatchers("/").permitAll()
//			.antMatchers("/login.html").denyAll()
//			.antMatchers("/administrateur/**").hasAuthority("ROLE_administrateur")
//			.antMatchers("/formateur/**").hasAnyAuthority("ROLE_formateur","ROLE_caca")
//			.antMatchers("/apprenant/**").hasAuthority("ROLE_apprenant")
//			.anyRequest().authenticated()
//		.and()
//			.csrf()
//			.disable();
	  		.cors()
	  	.and()
	  		.authorizeRequests()
	  		.anyRequest().authenticated()
	  	.and()
	  		.httpBasic();
	}
	
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        final CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("HEAD",
                "GET", "POST", "PUT", "DELETE", "PATCH"));
        // setAllowCredentials(true) is important, otherwise:
        // The value of the 'Access-Control-Allow-Origin' header in the response must not be the wildcard '*' when the request's credentials mode is 'include'.
        configuration.setAllowCredentials(true);
        // setAllowedHeaders is important! Without it, OPTIONS preflight request
        // will fail with 403 Invalid CORS request
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Cache-Control", "Content-Type"));
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
