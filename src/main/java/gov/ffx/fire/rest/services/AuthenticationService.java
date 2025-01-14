package gov.ffx.fire.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jakarta.annotation.PostConstruct;

public class AuthenticationService  implements UserDetailsService {
  private List<UserDetails> users;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<UserDetails> user = users.stream()
        .filter(u -> u.getUsername().equals(username))
        .findFirst();
    if (user.isPresent()) {
      return user.get();
    }
    throw new UsernameNotFoundException(String.format("The username '{}' not found", username));
  }

  @PostConstruct
  private void loadUsers() {

    UserDetails u1 = User.builder()
        .username("johndoe1")
        .password("1234")
        .authorities(List.of(
            new SimpleGrantedAuthority("READ")))
        .build();

    UserDetails u2 = User.builder()
        .username("trisha")
        .password("abcd")
        .authorities(List.of(
            new SimpleGrantedAuthority("READ"),
            new SimpleGrantedAuthority("WRITE")))
        .build();

    users = List.of(u1, u2);
  }
}
