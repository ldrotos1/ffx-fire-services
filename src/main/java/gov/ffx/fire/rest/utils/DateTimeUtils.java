package gov.ffx.fire.rest.utils;

import java.time.LocalDateTime;

public class DateTimeUtils {

  public static boolean isExpired(LocalDateTime expiresOn) {
    return expiresOn.isBefore(LocalDateTime.now());
  }
}
