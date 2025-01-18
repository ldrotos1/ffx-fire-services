package gov.ffx.fire.rest.models.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
