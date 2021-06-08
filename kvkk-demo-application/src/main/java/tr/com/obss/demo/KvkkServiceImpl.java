package tr.com.obss.demo;

import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import tr.com.obss.kvkk.KvkkService;
import tr.com.obss.kvkk.KvkkUpdateData;

@Log
@Service
public class KvkkServiceImpl implements KvkkService {

  @Override
  public void update(KvkkUpdateData data) {
    log.info("service");
  }
}
