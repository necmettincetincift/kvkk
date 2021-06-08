package tr.com.obss.kvkk.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("kvkk")
public class KvkkProperties {
  private String path = "kvkk";
  private boolean enabled = true;
}

