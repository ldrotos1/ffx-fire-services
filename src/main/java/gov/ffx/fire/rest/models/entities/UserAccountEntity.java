package gov.ffx.fire.rest.models.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "user_account", schema = "ffx_fire_ops")
public class UserAccountEntity {

  @Id
  private String username;
  private String email;
  private String firstName;
  private String lastName;
  private Boolean isAccountLocked;
  private LocalDateTime expiresOn;
  private LocalDateTime createdOn;
  private LocalDateTime updatedOn;
  private String createdBy;
  private String updatedBy;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "user_account_role", schema = "ffx_fire_ops", 
    joinColumns = @JoinColumn(name = "username"), 
    inverseJoinColumns = @JoinColumn(name = "roleName"))
  private Set<AccountRoleEntity> accountRoles;
}
