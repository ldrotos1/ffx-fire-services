package gov.ffx.fire.rest.models.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "account_role", schema = "ffx_fire_ops")
public class AccountRoleEntity {

  @Id
  private String roleName;
  private String roleDescription;

  @ManyToMany(mappedBy = "accountRoles")
  private Set<UserAccountEntity> assignedRole;
}