package gov.ffx.fire.rest.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import gov.ffx.fire.rest.models.entities.UserAccountEntity;

public interface UserAccountRepository extends CrudRepository<UserAccountEntity, String> {
  
  Optional<UserAccountEntity> findByEmail(String email);
}
