package tr.com.obss.kvkk;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KvkkUpdateData {
  private String tableName;
  private String key;
  private Map<String, Object> columnMap;
}
