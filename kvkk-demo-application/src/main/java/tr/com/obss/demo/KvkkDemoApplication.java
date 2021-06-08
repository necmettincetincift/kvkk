package tr.com.obss.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "tr.com.obss")
public class KvkkDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(KvkkDemoApplication.class, args);
  }

}
