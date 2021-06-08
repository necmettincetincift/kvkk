package tr.com.obss.kvkk;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Log
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/${kvkk.path}")
@PropertySource("classpath:kvkk.properties")
public class KvkkRestController {

  private final KvkkService service;

  @GetMapping("/status")
  public String status() {
    update(KvkkUpdateData.builder().tableName("deneme").key("1").build());
    return "OK !!!";
  }

  @PostMapping("/update")
  public void update(KvkkUpdateData data) {
    // todo validate
    service.update(data);
    log.info("Ok!!!!");
  }

}

