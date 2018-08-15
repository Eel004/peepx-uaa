package com.luongung.spring.peepx.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetailsService;
		
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		/*httpSecurity
			.authorizeRequests()
			.anyRequest().hasAnyRole("ADMIN","USER")
			.and()
			.authorizeRequests()
			.antMatchers("/login*")
			.permitAll()
			.and()
			.formLogin()
			.loginPage("/login.html")
			.loginProcessingUrl("/loginAction")
			.defaultSuccessUrl("/homepage.html", true)
			.failureUrl("/login.html?error=true")
			.permitAll()
			.and()
			.logout().logoutSuccessUrl("/login.html")
			.and()
			.csrf().disable();*/
		httpSecurity
			.csrf().disable()
			.authorizeRequests()
	        .antMatchers("/login*").anonymous()
	        .anyRequest().authenticated()
	        .and()
	        .formLogin()
	        .loginPage("/login.html")
	        .loginProcessingUrl("/loginAction")
	        .defaultSuccessUrl("/index.html", true)
	        .failureUrl("/login.html?error=true")
	        .and()
	        .logout()
	        .logoutUrl("logoutAction")
	        .deleteCookies("JSESSIONID")
	        .logoutSuccessUrl("/login.html");
	}
	
	
}
