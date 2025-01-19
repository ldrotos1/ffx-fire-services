package gov.ffx.fire.rest.models.mappers;

import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import gov.ffx.fire.rest.models.entities.UserAccountEntity;
import gov.ffx.fire.rest.utils.DateTimeUtils;

public class UserAccountMapper {

  public static UserDetails UserAccountEntityToUserDetails(UserAccountEntity entity) {
    return User.builder()
        .username(entity.getUsername())
        .password("")
        .accountExpired(DateTimeUtils.isExpired(entity.getExpiresOn()))
        .accountLocked(entity.getIsAccountLocked())
        .disabled(false)
        .credentialsExpired(false)
        .authorities(entity.getAccountRoles().stream()
            .map(role -> new SimpleGrantedAuthority(role.getRoleName()))
            .collect(Collectors.toList()))
        .build();
  }
}
