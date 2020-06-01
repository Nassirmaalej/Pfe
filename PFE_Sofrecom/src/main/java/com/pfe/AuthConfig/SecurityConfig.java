
  package com.pfe.AuthConfig;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.http.HttpMethod; import
  org.springframework.security.config.annotation.authentication.builders.
  AuthenticationManagerBuilder; import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
  import org.springframework.security.config.annotation.web.configuration.
  WebSecurityConfigurerAdapter;
  
  @Configuration public class SecurityConfig extends
  WebSecurityConfigurerAdapter {
  
  @Override protected void configure(HttpSecurity http) throws Exception {
  http.csrf().disable(). authorizeRequests().antMatchers(HttpMethod.OPTIONS,
  "/**").permitAll().anyRequest().authenticated() .and().httpBasic(); }
  
  @Autowired public void configureGlobal(AuthenticationManagerBuilder
  auth,AuthenticationManagerBuilder auth1) throws Exception {
  auth.inMemoryAuthentication().withUser("a").password("{noop}a").roles("USER")
  ;
  auth1.inMemoryAuthentication().withUser("b").password("{noop}b").roles("USER"
  );
  
  
  
  
  }
  
  }
 