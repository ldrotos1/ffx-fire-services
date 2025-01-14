package gov.ffx.fire.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

import gov.ffx.fire.rest.services.AuthenticationService;


@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain configure(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(req -> req.anyRequest().authenticated());
    http.x509(cert -> cert.subjectPrincipalRegex("CN=(.*?)(?:,|$)").userDetailsService(userDetailsService()));
    return http.build();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    return new AuthenticationService();
  }
}

