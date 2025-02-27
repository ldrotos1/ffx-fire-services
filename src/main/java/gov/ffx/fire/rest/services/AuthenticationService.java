package gov.ffx.fire.rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import gov.ffx.fire.rest.models.entities.UserAccountEntity;
import gov.ffx.fire.rest.models.mappers.UserAccountMapper;
import gov.ffx.fire.rest.repositories.UserAccountRepository;

public class AuthenticationService  implements UserDetailsService {

  @Autowired
  private UserAccountRepository userAccountRepo;

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

    Optional<UserAccountEntity> userAccount = userAccountRepo.findByEmail(email);
    if (userAccount.isPresent()) {
      return UserAccountMapper.UserAccountEntityToUserDetails(userAccount.get());
    }
    throw new UsernameNotFoundException(String.format("The user '{}' was not found", email));
  }
}
