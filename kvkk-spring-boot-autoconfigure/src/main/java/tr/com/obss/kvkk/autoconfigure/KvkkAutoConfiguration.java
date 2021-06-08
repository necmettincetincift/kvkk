package tr.com.obss.kvkk.autoconfigure;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import tr.com.obss.kvkk.KvkkRestController;
import tr.com.obss.kvkk.KvkkService;

@Log
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(KvkkProperties.class)
@AllArgsConstructor
@PropertySource("classpath:kvkk.properties")
public class KvkkAutoConfiguration {

  private final KvkkProperties properties;

  @Configuration
  @AllArgsConstructor
  static class KvkkRestControllerClass {

    private final KvkkService service;

    @Bean
    @ConditionalOnProperty(name = "kvkk.enabled", havingValue = "true")
    public KvkkRestController createKvkkRestController() {
      return new KvkkRestController(service);
    }
  }

  @Bean
  @ConditionalOnMissingBean(type = "tr.com.obss.kvkk.KvkkService")
  public KvkkService defaultKvkkService() {
    return data -> {
      log.info(data.getTableName());
      log.info(data.getKey());
    };
  }
}
